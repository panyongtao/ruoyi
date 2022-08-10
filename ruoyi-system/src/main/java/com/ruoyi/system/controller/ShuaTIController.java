package com.ruoyi.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 学生表Controller
 * 
 * @author ruoyi
 * @date 2022-07-20
 */
@Controller
@RequestMapping("/app")
public class ShuaTIController
{

    @GetMapping("/shuati")
    public String student(Model model)
    {
        model.addAttribute("a", "pan");
        return "/app/shuati";
    }


}
