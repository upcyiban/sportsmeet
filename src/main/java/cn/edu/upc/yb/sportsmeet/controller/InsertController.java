package cn.edu.upc.yb.sportsmeet.controller;

import cn.edu.upc.yb.sportsmeet.model.Competition;
import cn.edu.upc.yb.sportsmeet.model.CompetitionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yyljj on 2016/5/18.
 */
@Controller
public class InsertController {
    @Autowired
    private CompetitionDao competitionDao;

    @RequestMapping("/insertadmin")
    public String showInertadin(Model model) {
        Iterable<Competition> competitions=competitionDao.findAll(sortById());
        model.addAttribute("lists",competitions);
        return "insertadmin";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String InsertDate(String sportname, String studentname1, String studentgrade1, String studentname2, String studentgrade2, String studentname3, String studentgrade3, String studentname4, String studentgrade4, String studentname5, String studentgrade5, String studentname6, String studentgrade6, String studentname7, String studentgrade7, String studentname8, String studentgrade8) {
        Competition competition = new Competition(sportname, studentname1, studentgrade1, studentname2, studentgrade2, studentname3, studentgrade3, studentname4, studentgrade4, studentname5, studentgrade5, studentname6, studentgrade6, studentname7, studentgrade7, studentname8, studentgrade8);
        competitionDao.save(competition);

        return "insertsuccess";
    }


    private Sort sortById(){
        return new Sort(Sort.Direction.DESC,"id");
    }
}
