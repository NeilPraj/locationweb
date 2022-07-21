package com.neil.location.controllers;

import com.neil.location.entities.Location;
import com.neil.location.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {

    @Autowired
    LocationService service;

    @RequestMapping("/showCreate")
    public String showCreate(){
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap){
        Location locationSaved = service.saveLocation(location);
        String msg = "Location saved with id:"+locationSaved.getId();
        modelMap.addAttribute("msg",msg);
        return "createLocation";
    }

    @RequestMapping
    public String displayLocations(){
        return "displayLocations";
    }
}
