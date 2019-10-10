package com.example.MentorSkills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/skilldetailsapi")
public class MentorSkillsController {
    @Autowired MentorSkillsService mentorSkillsService;

    @RequestMapping("/skills/{name}")
    public List<MentorSkills> getSkills(@PathVariable String name) {
        return mentorSkillsService.getSkills(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/skills")
    public void setSkills(@RequestBody MentorSkills skills) {
        mentorSkillsService.setSkills(skills);
    }
}
