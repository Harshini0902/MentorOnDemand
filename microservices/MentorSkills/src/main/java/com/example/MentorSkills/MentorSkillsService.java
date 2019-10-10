package com.example.MentorSkills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MentorSkillsService {
    @Autowired
    private MentorSkillsRepository msr;
    public List<MentorSkills> getSkills(String name){
        List<MentorSkills> ls;
        ls=msr.findSkills(name);
        return ls;
    }
    public void setSkills(MentorSkills skills) {
        msr.save(skills);
    }

}
