package cn.edu.upc.yb.sportsmeet.controller;

import cn.edu.upc.yb.sportsmeet.model.Competition;
import cn.edu.upc.yb.sportsmeet.model.CompetitionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public String showInertadin(){
        return "insertadmin";
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String InsertDate(String sportname, String studentname1, String studentgrate1, String studentname2, String studentgrate2, String studentname3, String studentgrate3, String studentname4, String studentgrate4, String studentname5, String studentgrate5, String studentname6, String studentgrate6, String studentname7, String studentgrate7, String studentname8, String studentgrate8){
        Competition competition = new Competition(sportname,studentname1,studentgrate1,studentname2,studentgrate2,studentname3,studentgrate3,studentname4,studentgrate4,studentname5,studentgrate5,studentname6,studentgrate6,studentname7,studentgrate7,studentname8,studentgrate8);
        competitionDao.save(competition);
        return "insertsuccess";


    }
}
