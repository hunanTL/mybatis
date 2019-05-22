package com.example.ssm.controller;

import com.example.ssm.pojo.User;
import com.example.ssm.service.Impl.UserServiceImpl;
import com.example.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-05-16 23:18
 */
@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{page}")
    public String addUser(@PathVariable String page){

        return page;
    }

    /**
     * 添加用户
     */
    @RequestMapping("/addUser")
    public  String ssUser(User user){
        this.userService.addUser(user);
        return "redirect:/test/selectUser";
    }


    /**
     * 查询用户
     */
    @RequestMapping("/selectUser")
    public String selectUser(Model model){
        List<User> lists=this.userService.findUserAll();
        model.addAttribute("list", lists);
        return "list";
    }

    /**
     * 根据ID查找用户
     */
    @RequestMapping("/findUserById")
    public String findUserById(Integer id,Model model){
        User user=this.userService.selectBYUserId(id);
        model.addAttribute("user", user);
        return "user";
    }

    /**
     * 修改用户
     */
    @RequestMapping("/edit")
    public String updateUser(User user){
     this.userService.updateUser(user);
     return "redirect:/test/selectUser";
    }

    /**
     * 删除用户
     */
    @RequestMapping("/delete")
    public String deleteUser(Integer id){
      this.userService.deleteUser(id);
      return "redirect:/test/selectUser";
    }
}
