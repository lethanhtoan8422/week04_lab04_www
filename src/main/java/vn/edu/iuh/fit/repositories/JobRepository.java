package vn.edu.iuh.fit.repositories;

import vn.edu.iuh.fit.models.Job;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class JobRepository {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public JobRepository(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public boolean create(Job job){
        String sql = "INSERT INTO job (job_id, job_name, company, job_desc) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, job.getId(), job.getName(), job.getCompany().getId(), job.getDescription()) > 0;
    }

    public boolean update(Job job){
        String sql = "UPDATE job SET job_id = ?, job_name = ?, company = ?, job_desc = ?";
        return jdbcTemplate.update(sql, job.getId(), job.getName(), job.getCompany().getId(), job.getDescription()) > 0;
    }

    public boolean delete(long id){
        String sql = "DELETE FROM job WHERE job_id = ?";
        return jdbcTemplate.update(sql, id) > 0;
    }

    public Optional<Job> findById(long id){
        String sql = "SELECT * FROM job WHERE job_id = ?";
        return Optional.ofNullable(jdbcTemplate.queryForObject(sql, Job.class, id));
    }

    public List<Job> findAll(){
        String sql = "SELECT * FROM job";
        return jdbcTemplate.queryForList(sql, Job.class);
    }
}
