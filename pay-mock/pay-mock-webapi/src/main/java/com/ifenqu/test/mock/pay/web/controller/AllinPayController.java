package com.ifenqu.test.mock.pay.web.controller;

import com.alibaba.fastjson.JSON;
import com.ifenqu.test.mock.pay.cache.AllinCache;
import com.ifenqu.test.mock.pay.common.HtmlHelper;
import com.ifenqu.test.mock.pay.models.AllinRequestModel;
import com.ifenqu.test.mock.pay.models.AllinStatusQueryContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by shi on 2017/1/4.
 */
@RestController
@RequestMapping("/allin")
public class AllinPayController {

    private static Logger logger = LoggerFactory.getLogger(AllinPayController.class);

    @RequestMapping(value = "/asaop/rest/api/", method = RequestMethod.POST)
    public AllinStatusQueryContent pay(HttpServletRequest request, HttpServletResponse response, AllinRequestModel model) {
        logger.info("accept msg {}", JSON.toJSONString(model));
        String res = "";
        if ("allinpay.order.orderinstall.add".equals(model.getMethod())) {
            try {
                response.sendRedirect("/index?id=" + AllinCache.add(model));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if ("allinpay.order.orderinstall.query".equals(model.getMethod())) {
            //查询状态
            AllinStatusQueryContent content = new AllinStatusQueryContent();
            AllinStatusQueryContent.TOrder_info_response info_response = new AllinStatusQueryContent.TOrder_info_response();
            AllinStatusQueryContent.TOrder_info_response.TMap tMap = new AllinStatusQueryContent.TOrder_info_response.TMap();
            AllinStatusQueryContent.TOrder_info_response.TMap.TEntry tEntry = new AllinStatusQueryContent.TOrder_info_response.TMap.TEntry();
            tEntry.setKey(Long.valueOf(model.getOrder_id()));
            tEntry.setValue(AllinCache.getResult(model.getOrder_id()));
            tMap.setEntry(tEntry);
            info_response.setMap(tMap);
            content.setOrder_info_response(info_response);

            return content;
        }

        return null;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public AllinRequestModel getDate(String id) {
        return AllinCache.get(id);
    }

    @RequestMapping(value = "/set/result", method = RequestMethod.GET)
    public String setResult(String id, int r) {
        AllinCache.setResult(id, r);
        return "";
    }

}
