package com.example.TechnologiesMicroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/technologydetailsapi")
public class TechnologiesController {

    @Autowired
    private TechnologiesService technologiesService;

    @RequestMapping("/technologies")
    public List<Technologies> getTechnologies() {
        return technologiesService.getTechnologies();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/technologies")
    public void addUserDetails(@RequestBody Technologies technologies) {
        technologiesService.setTechnologies(technologies);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/technologies/{id}")
    public void deleteTechnology(@PathVariable String id) {
        technologiesService.deleteTechnology(id);
    }

}