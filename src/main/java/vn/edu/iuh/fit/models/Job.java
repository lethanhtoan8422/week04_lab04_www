package vn.edu.iuh.fit.models;


import java.io.Serializable;
import java.util.List;

public class Job implements Serializable {

    private long id;

    private String name;

    private Company company;

    private List<JobSkill> jobSkills;

    private String description;

    public Job(long id, String name, Company company, String description) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.description = description;
    }

    public Job() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<JobSkill> getJobSkills() {
        return jobSkills;
    }

    public void setJobSkills(List<JobSkill> jobSkills) {
        this.jobSkills = jobSkills;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
