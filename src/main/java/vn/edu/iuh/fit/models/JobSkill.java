package vn.edu.iuh.fit.models;

import java.io.Serializable;

public class JobSkill implements Serializable {

    private Job job;

    private Skill skill;

    private SkillLevel skillLevel;

    private String moreInfo;

    public JobSkill(Job job, Skill skill, SkillLevel skillLevel, String moreInfo) {
        this.job = job;
        this.skill = skill;
        this.skillLevel = skillLevel;
        this.moreInfo = moreInfo;
    }

    public JobSkill() {

    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public SkillLevel getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(SkillLevel skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

}
