package com.finup.web;

import com.finup.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: Wang Chong
 * @Description:
 * @Date: Created on 2016/12/28.
 * @Modified by:
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;
//    @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.POST)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
//        return girlProperties.getCupSize();
        return id + "od";
    }

}
