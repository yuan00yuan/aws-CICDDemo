package org.dicey.hellospringboot;

import org.dicey.bean.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @Autowired
    private StudentProperties sp;

    @RequestMapping("/hello")
    public String hello(Model model) {
//        // return "hello world" + name + age;
////        // return conteng;
////        System.out.println(sp.getAge());
////        return sp.getName() + "." + sp.getAge();
////        // return "hello";
        System.out.println("hello!!!!!");
        model.addAttribute("name", "world");
        return "template/hello";
    }
}
