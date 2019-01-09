package com.zxm.spider.constants;

import java.util.ArrayList;
import java.util.List;

public interface BaseConstants {
    int APP_ID =1;
    int CATEGORYID_TODAY =153;
    int CATEGORYID_TOMORROW =154;
    int MODEL_ID =8;
    List<Integer> categoryIds = new ArrayList(){{add(150);add(153);add(154);add(155);}};
    String ARTICLE_LEQIUBA_AUTHTOR="LQB";
    String ARTICLE_URL_TODAY_PRIFIX="/150/153";
    String ARTICLE_URL_TOMORRROW_PRIFIX="/150/154";
    String ARTICLE_URL_THE_DAY_AFTER_TOMORRROW_PRIFIX="/150/155";

    String GLOBAL_URL="http://localhost:8181/templets/1/leqiuba/";
    //暂未开始html模板
    String ARTICLE_LIST_STATUS_UN_TEM="<p class=\"notBegin\"><img src=\"" + GLOBAL_URL + "/images/shiping.png\">暂未开始</p>";
    String ARTICLE_DETAIL_STATUS_UN_TEM="<p class=\"state\" style=\"background: rgb(189, 189, 189);\"><img src=\""+ GLOBAL_URL + "/images/shiping.png\">未开始</p>";
    //正在直播
    String ARTICLE_LIST_STATUS_TEM = "<p class=\"\"><img src=\""+ GLOBAL_URL + "/images/shiping.png\">视频直播</p>";
    String ARTICLE_DETAIL_STATUS_TEM = "<p class=\"state\" style=\"background: red;\"><img src=\""+ GLOBAL_URL + "/images/shiping.png\">直播中</p>";

    String HOT_TEM="<img class=\"hot\" src=\""+ GLOBAL_URL + "/images/remen.png\">";
}
