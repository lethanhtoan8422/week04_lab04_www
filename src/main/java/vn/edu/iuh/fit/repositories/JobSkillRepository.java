package vn.edu.iuh.fit.repositories;

import vn.edu.iuh.fit.models.JobSkill;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class JobSkillRepository {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public JobSkillRepository(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public boolean create(JobSkill jobSkill){
        String sql = "INSERT INTO job_skill (job_id, skill_id, skill_level, more_infos) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, jobSkill.getJob().getId(), jobSkill.getSkill().getId(), jobSkill.getSkillLevel(), jobSkill.getMoreInfo()) > 0;
    }

    public boolean update(JobSkill jobSkill){
        String sql = "UPDATE job_skill SET job_id = ?, skill_id = ?, skill_level = ?, more_infos = ?";
        return jdbcTemplate.update(sql, jobSkill.getJob().getId(), jobSkill.getSkill().getId(), jobSkill.getSkillLevel(), jobSkill.getMoreInfo()) > 0;
    }

    public boolean delete(long jobId, long skillId){
        String sql = "DELETE FROM job_skill WHERE job_id = ? AND skill_id = ?";
        return jdbcTemplate.update(sql, jobId, skillId) > 0;
    }

    public Optional<JobSkill> findById(long jobId, long skillId){
        String sql = "SELECT * FROM job_skill WHERE job_id = ? AND skill_id = ?";
        return Optional.ofNullable(jdbcTemplate.queryForObject(sql, JobSkill.class, jobId, skillId));
    }

    public List<JobSkill> findAll(){
        String sql = "SELECT * FROM job_skill";
        return jdbcTemplate.queryForList(sql, JobSkill.class);
    }
}
