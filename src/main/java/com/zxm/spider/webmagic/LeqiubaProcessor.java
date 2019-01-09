package com.zxm.spider.webmagic;


import com.zxm.spider.constants.BaseConstants;
import com.zxm.spider.model.DiyGameVO;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.selenium.SeleniumDownloader;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@Service("leqiubaProcessor")
public class LeqiubaProcessor implements PageProcessor {

    public static final String URL_LIST = "https://leqiuba.com/";
    public static final String URL_POST = "https://leqiuba.com/zhibo/\\w+\\.html";

    private Site site = Site
            .me()
            .setDomain("leqiuba.com")
            .setSleepTime(3000)
            .setUserAgent(
                    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");

    //此处持久化会导致bean失效,自定义pipeline做持久化
  /*  @Autowired
    DiyGameVODAO diyGameVODAO;*/
    @Autowired
    Pipeline diyGameDaoPipeLine;
    @Override
    public void process(Page page) {
        //列表页
        //if (page.getUrl().regex(URL_LIST).match()) {
        if (URL_LIST.equals(page.getUrl().toString())) {
            //page.addTargetRequests(page.getHtml().xpath("//div[@class=\"download\"]").links().regex(URL_POST).all());
            List<Selectable> nodeList  = page.getHtml().xpath("//div[@class=\"todayMatch match\"]").xpath("//div[@class=\"contenTab\"]").nodes();
            for(Selectable item : nodeList) {
                Request request = new Request();
                String url = item.links().toString();
                request.setUrl(url);
                String isHot = item.xpath("//img[@class=\"hot\"]").toString();
                Map<String, Object> map = new HashMap<>();
                map.put("isHot", !StringUtils.isEmpty(isHot));
                request.setExtras(map);
                page.addTargetRequest(request);
            }
            //使用Request携带上级页面信息
            /*
            List<String> list = page.getHtml().xpath("//div[@class=\"todayMatch match\"]").xpath("//div[@class=\"contenTab\"]").links().all();
            page.addTargetRequests(list);
            */
        } else  if(page.getUrl().regex(URL_POST).match()){
            DiyGameVO vo = new DiyGameVO();
            Boolean isHot = (Boolean)page.getRequest().getExtra("isHot");
            vo.setIshot(isHot?BaseConstants.HOT_TEM : "");
            String teamNameOne = page.getHtml().xpath("//div[@class='msg']").xpath("//li[@class='teamName nameOne']/text()").toString();
            vo.setHost(teamNameOne);
            String teamNameTwo = page.getHtml().xpath("//div[@class='msg']").xpath("//li[@class='teamName nameTwo']/text()").toString();
            vo.setGuest(teamNameTwo);
            String gameTime = page.getHtml().xpath("//div[@class='msg']").xpath("//li[@class='timer']").xpath("//p[@class='t']/text()").toString();
            vo.setGametime(gameTime);
            String gameType = page.getHtml().xpath("//div[@class='msg']").xpath("//li[@class='timer']").xpath("//p/text()").toString();
            vo.setGametype(gameType);

            String scoreHome = page.getHtml().xpath("//div[@class='msg']").xpath("//li[@class='score home']/text()").toString();
            vo.setScorehome(scoreHome);
            String scoreVisit = page.getHtml().xpath("//div[@class='msg']").xpath("//li[@class='score visit']/text()").toString();
            vo.setScorevisit(scoreVisit);

            String linkNanmea = page.getHtml().xpath("//div[@class='channel']").xpath("//a[@target='_blank']/text()").toString();
            vo.setLinknamea(linkNanmea);
            String linkone = page.getHtml().xpath("//div[@class='channel']").xpath("//a[@target='_blank']/@onclick").toString();
            vo.setLinkone(linkone);

            String imgOne =  page.getHtml().xpath("//div[@class='msg']/ul/li[2]/img/@src").toString();
            String imgTwo =  page.getHtml().xpath("//div[@class='msg']/ul/li[6]/img/@src").toString();

            vo.setImgone(imgOne);
            vo.setImgtwo(imgTwo);

            String gameState = page.getHtml().xpath("//div[@class='msg']/p/text()").toString();
            vo.setGamestate(gameState);

            //状态通过接口调用加载的，需要修改
            if("未开始".equals(gameState)) {
                vo.setZtlhtml(BaseConstants.ARTICLE_LIST_STATUS_UN_TEM);
                vo.setZtdhtml(BaseConstants.ARTICLE_DETAIL_STATUS_UN_TEM);
            } else  if ("直播中".equals(gameState)){
                vo.setZtlhtml(BaseConstants.ARTICLE_LIST_STATUS_TEM);
                vo.setZtdhtml(BaseConstants.ARTICLE_DETAIL_STATUS_TEM);
            }
            //标注爬取的栏目
            page.putField("categoryid",BaseConstants.CATEGORYID_TODAY);
            page.putField("leqiubaVO", vo);
        }
    }

    @Override
    public Site getSite() {
        return site;
    }

    @Transactional
    public void generate() {
        System.getProperties().setProperty("selenuim_config",
                "D:\\workspace\\self\\zbspider\\config.ini");
        Spider.create(new LeqiubaProcessor()).setDownloader(new SeleniumDownloader()).addUrl("https://leqiuba.com/").addPipeline(diyGameDaoPipeLine)
                .run();
    }
}