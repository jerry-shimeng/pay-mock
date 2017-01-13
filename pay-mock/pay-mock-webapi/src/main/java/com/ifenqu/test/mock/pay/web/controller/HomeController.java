package com.ifenqu.test.mock.pay.web.controller;

import com.ifenqu.test.mock.pay.common.HtmlHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by shi on 2017/1/6.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "t1",method = RequestMethod.GET)
    public String t1(HttpServletRequest request){
        return HtmlHelper.get().read(request);
    }
}
