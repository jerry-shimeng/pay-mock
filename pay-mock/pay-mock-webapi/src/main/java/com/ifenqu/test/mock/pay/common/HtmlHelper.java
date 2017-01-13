package com.ifenqu.test.mock.pay.common;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

/**
 * Created by shi on 2017/1/9.
 */

public class HtmlHelper {

    public static HtmlHelper get(){
        return new HtmlHelper();
    }

    public   String read(HttpServletRequest request) {

        InputStream inputStream = this.getClass().getResourceAsStream("/templates/index.vm");
        BufferedReader reader = null;
        StringBuilder sb = new StringBuilder();
        try {

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            reader = new BufferedReader(inputStreamReader);

            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                sb.append(tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return sb.toString();
    }
}
