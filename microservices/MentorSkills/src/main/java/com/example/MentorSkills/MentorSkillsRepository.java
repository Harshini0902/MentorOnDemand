package com.example.MentorSkills;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MentorSkillsRepository extends CrudRepository<MentorSkills,String> {
    @Query(value="select * from mentor_skills where mentor_name=?1",nativeQuery = true)
    List<MentorSkills> findSkills(String name);
}
