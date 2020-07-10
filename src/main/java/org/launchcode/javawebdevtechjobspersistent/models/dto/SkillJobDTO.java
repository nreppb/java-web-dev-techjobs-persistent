package org.launchcode.javawebdevtechjobspersistent.models.dto;

import com.sun.istack.NotNull;
import org.launchcode.javawebdevtechjobspersistent.models.Job;
import org.launchcode.javawebdevtechjobspersistent.models.Skill;

public class SkillJobDTO {

    @NotNull
    private Skill skill;

    @NotNull
    private Job job;

    public SkillJobDTO() {}

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
