package com.finup.web;

import com.finup.domain.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Wang Chong
 * @Description:
 * @Date: Created on 2017/1/23.
 * @Modified by:
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() throws Exception {
       // throw new Exception("胡萝卜");
        return "hello";
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

    @RequestMapping("/login")
    public String login() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<");
        return "login";
    }
}
