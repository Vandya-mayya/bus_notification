package com.example.busnotification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.busnotification.entity.addroute;
import com.example.busnotification.service.addrouteservice;



@Controller
public class buscontroller {
	
	@Autowired
	addrouteservice addservice;
    @RequestMapping("/admin")
    public String admin()
    {
    	return "admin";
    }
    @RequestMapping("/addroute")
    public String showAddRouteForm(Model model) {
        model.addAttribute("route", new addroute());
        return "addroute";  // Returns addroute.html
    }

    @PostMapping("/addroute")
    public String addroute(@ModelAttribute addroute r1) {  
    	addservice.addroute(r1);
    	return "redirect:/admin";
    }
    }

   