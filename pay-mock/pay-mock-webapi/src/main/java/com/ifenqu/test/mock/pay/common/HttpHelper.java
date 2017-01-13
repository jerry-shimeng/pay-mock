package com.ifenqu.test.mock.pay.common;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Created by shi on 6/2/2016.
 */
public class HttpHelper {

    public static String get(String url) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        RequestBuilder builder = RequestBuilder.get(url);


        HttpUriRequest httpGet = builder.build();
        CloseableHttpResponse response = httpClient.execute(httpGet);

        return process(response, httpClient);
    }

    public static String delete(String url) throws Exception {
        // 创建httppost
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpRequestBase http = new HttpDelete(url);
        http.addHeader("Content-type", "application/json;");
        http.setHeader("Accept", "application/json");
        CloseableHttpResponse response = httpClient.execute(http);

        return process(response,  httpClient);
    }


    public static String put(String url, String json) throws Exception {
//        // 创建httppost
        HttpEntityEnclosingRequestBase httppost = new HttpPut(url);
        return beginRequest(json, httppost);
    }


    public static String post(String url, String json) throws Exception {
        // 创建httppost
        HttpEntityEnclosingRequestBase httppost = new HttpPost(url);
        return beginRequest(json, httppost);
    }


    public static String beginRequest(String json, HttpEntityEnclosingRequestBase http) throws Exception {

        // 创建默认的httpClient实例.
        CloseableHttpClient httpclient = HttpClients.createDefault();
        http.setHeader("Content-Type","application/json;UTF-8");
        http.setEntity(new StringEntity(json,Charset.forName("utf-8")));
        CloseableHttpResponse response = httpclient.execute(http);

        return process(response, httpclient);
    }


    private static String process(CloseableHttpResponse response, CloseableHttpClient httpclient) throws Exception {
        String str = "";
        try {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                str = InputStreamTOString(entity.getContent());
            }
        } finally {
            response.close();
            httpclient.close();
        }
        return str;
    }

    public static String InputStreamTOString(InputStream in) throws IOException {

        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] data = new byte[1024 * 1024];
        int count = -1;
        while ((count = in.read(data, 0, 1024 * 1024)) != -1)
            outStream.write(data, 0, count);

        data = null;
        return new String(outStream.toByteArray(), "utf8");
    }

}
