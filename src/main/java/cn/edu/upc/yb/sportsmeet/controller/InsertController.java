package cn.edu.upc.yb.sportsmeet.controller;

import cn.edu.upc.yb.sportsmeet.model.Competition;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 易班技术开发部 on 2016/5/18.
 */
@Controller
public class InsertController {

    @RequestMapping("/insert")
    public String InsertDate(String competition,String[] student,String[] studentname,String[] studentmark){
        Competition people = new Competition();

    }
}
