package vn.edu.iuh.fit.repositories;

import vn.edu.iuh.fit.models.Address;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class AddressRepository {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public AddressRepository(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public boolean create(Address address){
        String sql = "INSERT INTO address (add_id, city, country, zipcode, street, number) VALUES (?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, address.getAddId(), address.getCity(), address.getCountry(), address.getZipcode(), address.getStreet(), address.getNumber()) > 0;
    }

    public boolean update(Address address){
        String sql = "UPDATE address SET add_id = ?, city = ?, country = ?, zipcode = ?, street = ?, number = ?";
        return jdbcTemplate.update(sql, address.getAddId(), address.getCity(), address.getCountry(), address.getZipcode(), address.getStreet(), address.getNumber()) > 0;
    }

    public boolean delete(long id){
        String sql = "DELETE FROM address WHERE add_id = ?";
        return jdbcTemplate.update(sql, id) > 0;
    }

    public Optional<Address> findById(long id){
        String sql = "SELECT * FROM address WHERE add_id = ?";
        return Optional.ofNullable(jdbcTemplate.queryForObject(sql, Address.class, id));
    }

    public List<Address> findAll(){
        String sql = "SELECT * FROM address";
        return jdbcTemplate.queryForList(sql, Address.class);
    }
}
