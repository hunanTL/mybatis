package com.tanlei.cn.controller;

import com.tanlei.cn.pojo.Person;
import com.tanlei.cn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-05-22 13:29
 */

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/{page}")
    public String index(@PathVariable String page){
        return page;
    }


    @RequestMapping("/addPerson")
    public String addPerson(Person person){
        this.personService.addPerson(person);
        return  "redirect:/person/selectAllPerson";
    }

    @RequestMapping("/selectAllPerson")
    public String selectAllPerson(Model model){
        List<Person> lists=this.personService.selectPerson();
        model.addAttribute("list", lists);
        return "person";
    }

    @RequestMapping("/selectByID")
    public String selectByID(Integer id,Model model){
        Person person=this.personService.selectById(id);
        model.addAttribute("person", person);
        return "update";
    }

    @RequestMapping("/update")
    public String updatePerson(Person person){
       this.personService.updatePerson(person);
       return "redirect:/person/selectAllPerson";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        this.personService.delete(id);
        return "redirect:/person/selectAllPerson";
    }
}
