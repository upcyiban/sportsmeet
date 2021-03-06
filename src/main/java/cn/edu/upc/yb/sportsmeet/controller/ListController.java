package cn.edu.upc.yb.sportsmeet.controller;

import antlr.ASTNULLType;
import cn.edu.upc.yb.sportsmeet.model.Competition;
import cn.edu.upc.yb.sportsmeet.model.CompetitionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ListController {

    @Autowired
    private CompetitionDao competitionDao;

    @RequestMapping("/")
    public String list(Model model) {
        Iterable<Competition> competitions = competitionDao.findAll(sortById());
        model.addAttribute("lists", competitions);
        return "list";

    }

    private Sort sortById() {
        return new Sort(Sort.Direction.DESC, "id");
    }

    @RequestMapping("/showlist")
    public String showList(int id, Model model) {
        Competition competition = competitionDao.findOne(id);
        model.addAttribute("lists", competition);
        return "showlist";
    }

//    @RequestMapping("/return")
//    public String returnList(){
//        return "list";
//    }


}
