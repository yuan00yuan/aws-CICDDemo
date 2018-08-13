package org.dicey.controller;

import org.dicey.bean.User;
import org.dicey.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/list")
    public String listUser(Model model) {
        List<User> users = userMapper.findAll();
        for(User user:users) {
            System.out.println(user.getUsername());
        }
        model.addAttribute("users", users);
        //map.put("users", users);
        return "template/listUser";
    }
}
