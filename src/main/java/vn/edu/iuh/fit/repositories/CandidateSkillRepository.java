package vn.edu.iuh.fit.repositories;

import vn.edu.iuh.fit.models.CandidateSkill;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class CandidateSkillRepository {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public CandidateSkillRepository(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public boolean create(CandidateSkill candidateSkill){
        String sql = "INSERT INTO candidate_skill (can_id, skill_id, skill_level, more_infos) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, candidateSkill.getCandidate().getId(), candidateSkill.getSkill().getId(), candidateSkill.getSkillLevel(), candidateSkill.getMoreInfo()) > 0;
    }

    public boolean update(CandidateSkill candidateSkill){
        String sql = "UPDATE candidate_skill SET can_id = ?, skill_id = ?, skill_level = ?, more_infos = ?";
        return jdbcTemplate.update(sql, candidateSkill.getCandidate().getId(), candidateSkill.getSkill().getId(), candidateSkill.getSkillLevel(), candidateSkill.getMoreInfo()) > 0;
    }

    public boolean delete(long canId, long skillId){
        String sql = "DELETE FROM candidate_skill WHERE can_id = ? AND skill_id = ?";
        return jdbcTemplate.update(sql, canId, skillId) > 0;
    }

    public Optional<CandidateSkill> findById(long canId, long skillId){
        String sql = "SELECT * FROM candidate_skill WHERE can_id = ? AND skill_id = ?";
        return Optional.ofNullable(jdbcTemplate.queryForObject(sql, CandidateSkill.class, canId, skillId));
    }

    public List<CandidateSkill> findAll(){
        String sql = "SELECT * FROM candidate_skill";
        return jdbcTemplate.queryForList(sql, CandidateSkill.class);
    }
}
