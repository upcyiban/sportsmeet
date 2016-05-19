package cn.edu.upc.yb.sportsmeet.controller;

import cn.edu.upc.yb.sportsmeet.model.CompetitionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yyljj on 2016/5/19.
 */
@Controller
public class DeletController {

    @Autowired
    private CompetitionDao competitionDao;

    @RequestMapping("/delet")
    public String deletMessage(int id){
        competitionDao.delete(id);
        return "redirect:/insertadmin";

    }
}
