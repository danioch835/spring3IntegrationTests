package com.example.bobo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class CountryRepository {

    private DataSource dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getName(Long id) {
        String sql = "SELECT \"CountryName\" from dbo.\"Country\" where \"CountryId\" = ? ";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String name = jdbcTemplate.query(sql,
                                         preparedStatement -> {preparedStatement.setLong(1, id);},
                                         (resultSet, i) -> resultSet.getString("CountryName")).get(0);
        return name;
    }

    public void updateName(Long id, String name) {
        String sql = "UPDATE dbo.\"Country\" set \"CountryName\" = ? where \"CountryId\" = ?";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql, name, id);
    }
}
