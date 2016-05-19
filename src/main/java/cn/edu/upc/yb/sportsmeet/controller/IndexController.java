package cn.edu.upc.yb.sportsmeet.controller;

import cn.edu.upc.yb.sportsmeet.model.Competition;
import cn.edu.upc.yb.sportsmeet.model.CompetitionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wanghaojun on 2016/5/18.
 */
@Controller
public class IndexController {
    @Autowired
    private CompetitionDao competitionDao;

    @RequestMapping({"/"})
    public String IndexController() {
        return "index";
    }


}
