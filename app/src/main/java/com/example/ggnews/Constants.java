package com.example.ggnews;

public final class Constants {
    private Constants() {
    }

    public static final int NEWS_NUM = 10;
    public static String SERVER_URL = "http://api.tianapi.com/";
    public static String ALL_NEWS_PATH = "bulletin/index";
    public static String GENERAL_NEWS_PATH = "bulletin/";

    public static String API_KEY = "5e216689f6b999e0fcf1086fc9f7c03e";

    public static String ALL_NEWS_URL = SERVER_URL + ALL_NEWS_PATH;
    public static String GENERAL_NEWS_URL = SERVER_URL + GENERAL_NEWS_PATH;

    public static int NEWS_COL5 = 5;
    public static int NEWS_COL7 = 7;
    public static int NEWS_COL8 = 8;
    public static int NEWS_COL10 = 10;
    public static int NEWS_COL11 = 11;

    public static String NEWS_DETAIL_URL_KEY = "news_detail_url_key";
}
