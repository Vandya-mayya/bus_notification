package com.example.busnotification.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.busnotification.entity.addroute;
import com.example.busnotification.service.addrouteservice;
@Controller
@RequestMapping("/admin")
public class admincontroller {
	

    @Autowired
    private addrouteservice addRouteService;

    @GetMapping
    public String adminPage(Model model) {
        // Fetch the most recent route
    	List<addroute> recentRoutes = addRouteService.getRecentRoutes();

        // Add the recent route to the model
        model.addAttribute("recentRoutes", recentRoutes);

        // Return the admin page view
        return "admin"; // Replace with your actual admin page file name
    }
  
    
   
}
