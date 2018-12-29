package com.zxm.spider.webmagic;


import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

public class LeqiubaProcessor implements PageProcessor {

    public static final String URL_LIST = "https://leqiuba.com/";

    public static final String URL_POST = "/zhibo/\\w+\\.html";

    private Site site = Site
            .me()
            .setDomain("leqiuba.com")
            .setSleepTime(3000)
            .setUserAgent(
                    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");

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
            page.putField("title", page.getHtml().xpath("//div[@class='todayMatch match']/h2"));
            page.putField("content", page.getHtml().xpath("//div[@id='articlebody']//div[@class='articalContent']"));
            page.putField("date",
                    page.getHtml().xpath("//div[@id='articlebody']//span[@class='time SG_txtc']").regex("\\((.*)\\)"));
        }
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new LeqiubaProcessor()).addUrl("https://leqiuba.com/")
                .run();
    }
}