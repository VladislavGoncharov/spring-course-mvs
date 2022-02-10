package com.vladgoncharov.spring.mvc;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
//@RequestMapping("/employee")
public class NewController {
    @RequestMapping("/")
    public String showFirstView()
    {
        return "one-view";
    }

    @RequestMapping("/askNameEmployee")
    public String askEmployeeDetails(Model model){

        model.addAttribute("employee", new Employee());

        return "ask-name-emp";
    }

    @RequestMapping("/showViewEmployee")
    public String showViewEmployee(@Valid @ModelAttribute ("employee") Employee employee, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return "ask-name-emp";
        }
        else return"show-view-emp";
    }



}
