package cn.edu.upc.yb.sportsmeet.controller;

import antlr.ASTNULLType;
import cn.edu.upc.yb.sportsmeet.model.Competition;
import cn.edu.upc.yb.sportsmeet.model.CompetitionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 易班技术开发部 on 2016/
 */5/18.
@Controller
public class ListController {

    @Autowired
    private CompetitionDao competitionDao;

    @RequestMapping("/list")
    public String listDate(Model model){



        Iterable<Competition> competitions=competitionDao.findAll();

        model.addAttribute("list",competitions);

        return "list";

    }
}
