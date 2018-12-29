package com.zxm.spider.webmagic;


import com.zxm.spider.mapper.DiyGameVODAO;
import com.zxm.spider.model.DiyGameVO;
import com.zxm.spider.model.DiyGameVOCondition;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class LeqiubaProcessor implements PageProcessor {

    public static final String URL_LIST = "https://leqiuba.com/";
    public static final String URL_POST = "/zhibo/\\w+\\.html";

    private Site site = Site
            .me()
            .setDomain("leqiuba.com")
            .setSleepTime(3000)
            .setUserAgent(
                    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");

    @Resource
    private DiyGameVODAO diyGameVODAO;
    @Override
    public void process(Page page) {
        //列表页
        if (page.getUrl().regex(URL_LIST).match()) {
            page.addTargetRequests(page.getHtml().xpath("//div[@class=\"download\"]").links().regex(URL_POST).all());
            List<String> list = page.getHtml().xpath("//div[@class=\"todayMatch match\"]").xpath("//div[@class=\"contenTab\"]").all();

            for(String item : list) {
                System.out.println("item:" + item);
            }

        } else  if(page.getUrl().regex(URL_POST).match()){

            DiyGameVO vo = new DiyGameVO();
            String teamNameOne = page.getHtml().xpath("//div[@class='msg']/h2").xpath("//li[@class='teamName nameOne']").toString();
            vo.setHost(teamNameOne);
            String teamNameTwo = page.getHtml().xpath("//div[@class='msg']/h2").xpath("//li[@class='teamName nameTwo']").toString();
            vo.setGuest(teamNameTwo);
            String gameTime = page.getHtml().xpath("//div[@class='msg']/h2").xpath("//li[@class='timer']").xpath("//p[@class='t']").toString();
            vo.setGametime(gameTime);
            String linkOne = page.getHtml().xpath("//div[@class='channel']").xpath("//a[@target='_blank']").toString();
            vo.setLinkone(linkOne);

            DiyGameVOCondition condition = new DiyGameVOCondition();
            condition.createCriteria().andGametimeEqualTo(gameTime).andHostEqualTo(teamNameOne).andGuestEqualTo(teamNameTwo);
            int cnt = diyGameVODAO.countByCondition(condition);
            if(cnt ==0) {
                diyGameVODAO.insert(vo);
            }
        }
    }

    @Override
    public Site getSite() {
        return site;
    }

    public void generate() {
        Spider.create(new LeqiubaProcessor()).addUrl("https://leqiuba.com/")
                .run();
    }
}