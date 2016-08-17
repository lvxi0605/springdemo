package edu.jxufe.lvxi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lvxi on 2016/8/17.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);
        System.out.print("tets346");
        return "hello";
    }
}
