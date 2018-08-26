package cn.fcsca.springboottomcat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HelloController
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 22:43 2018-08-13
 */
@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(Model model) {
        model.addAttribute("msg", "你好！");
        return "success";
    }
}
