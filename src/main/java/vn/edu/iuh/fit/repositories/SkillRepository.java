package vn.edu.iuh.fit.repositories;

import vn.edu.iuh.fit.models.Skill;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class SkillRepository {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public SkillRepository(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public boolean create(Skill skill){
        String sql = "INSERT INTO skill (skill_id, skill_type, skill_name, skill_desc) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, skill.getId(), skill.getSkillType(), skill.getSkillName(), skill.getSkillDescription()) > 0;
    }

    public boolean update(Skill skill){
        String sql = "UPDATE skill SET skill_id = ?, skill_type = ?, skill_name = ?, skill_desc = ?";
        return jdbcTemplate.update(sql, skill.getId(), skill.getSkillType(), skill.getSkillName(), skill.getSkillDescription()) > 0;
    }

    public boolean delete(long id){
        String sql = "DELETE FROM skill WHERE skill_id = ?";
        return jdbcTemplate.update(sql, id) > 0;
    }

    public Optional<Skill> findById(long id){
        String sql = "SELECT * FROM skill WHERE skill_id = ?";
        return Optional.ofNullable(jdbcTemplate.queryForObject(sql, Skill.class, id));
    }

    public List<Skill> findAll(){
        String sql = "SELECT * FROM skill";
        return jdbcTemplate.queryForList(sql, Skill.class);
    }
}
