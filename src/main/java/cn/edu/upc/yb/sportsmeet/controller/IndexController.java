package cn.edu.upc.yb.sportsmeet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wanghaojun on 2016/5/18.
 */
@Controller
public class IndexController {
    @RequestMapping({"/"})
    public String IndexController(){
        return "index";
    }


}
