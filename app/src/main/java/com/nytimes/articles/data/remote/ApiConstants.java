package com.nytimes.articles.data.remote;


/**
 * Keep all the service related constants here.
 * <p>
 * Author: Sunaij Iqbal
 * Created: 30/03/2019
 * Modified: 30/03/2019
 */
public class ApiConstants {
    public static final String BASE_URL = "http://api.nytimes.com/";
    public static final long CONNECT_TIMEOUT = 30000;
    public static final long READ_TIMEOUT = 30000;
    public static final long WRITE_TIMEOUT = 30000;
    public static final String API_KEY = "Put your api key here";

    private ApiConstants(){
        // Private constructor to hide the implicit one
    }

}
