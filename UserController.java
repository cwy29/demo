package com.example.demojishi.controlller;

import com.example.demojishi.bean.User;
import com.example.demojishi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/into")
    public String into(){

        return "reg";
    }



    @RequestMapping("/toreg")
    public String toreg(User user){
        userService.reg(user.getUsername(),user.getUserpwd());
        return "login";
    }
    @RequestMapping("/tologin")
    public String tologin (User user, Model model){
        user=userService.login(user.getUsername(),user.getUserpwd());
        model.addAttribute("username",user.getUsername());
        System.out.println("插入成功，请到数据库查看");
        return "welcome";
    }
}
