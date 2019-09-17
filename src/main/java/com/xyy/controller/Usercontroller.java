package com.xyy.controller;

import com.xyy.baen.User;
import com.xyy.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpContext;
import java.util.List;

@Controller
public class Usercontroller {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/abc")
    public ModelAndView find(ModelAndView modelAndView){
        List<User> all = userServiceImpl.findAll();
        System.out.println(all);
        modelAndView.setViewName("success");
        modelAndView.addObject("model",all);
        return modelAndView;
    }

    @RequestMapping("/d")
    public ModelAndView findById(){
        ModelAndView modelAndView = new ModelAndView();
        int id=1;
        User byId = userServiceImpl.findById(id);
        System.out.println(byId);
        modelAndView.setViewName("chunling");
        modelAndView.addObject("models",byId);
        return modelAndView;
    }
}
