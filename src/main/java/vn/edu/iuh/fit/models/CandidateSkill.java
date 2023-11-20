package vn.edu.iuh.fit.models;

import java.io.Serializable;


public class CandidateSkill implements Serializable {

    private Candidate candidate;

    private Skill skill;

    private SkillLevel skillLevel;

    private String moreInfo;

    public CandidateSkill(Candidate candidate, Skill skill, SkillLevel skillLevel, String moreInfo) {
        this.candidate = candidate;
        this.skill = skill;
        this.skillLevel = skillLevel;
        this.moreInfo = moreInfo;
    }

    public CandidateSkill() {

    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
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
