package pl.akademiakodu.setup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.setup.models.EventModel;
import pl.akademiakodu.setup.service.EventService;

import java.util.List;

/**
 * Created by Patryk Dudzik on 02.11.2017.
         */

@Controller
public class MainController {

    @Autowired
    EventService eventService;

    @GetMapping ("/")
    public String mainPage(ModelMap modelMap) {
        List<EventModel> events = eventService.findAll();
        modelMap.addAttribute("events", events);
        return "indexTemplate";
    }
}
