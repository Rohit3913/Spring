package com.rohit.web.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.rohit.web.Model.City;



@Component("empDAO")
public class EmployeeDAO {

	NamedParameterJdbcTemplate template;
	public NamedParameterJdbcTemplate getTemplate() {
		return template;
	}
	@Autowired
	public void setTemplate(DataSource dataSource) {
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}

	public EmployeeDAO() {
	System.out.println("Cool its loaded");
	}

	public String getmessage() {
		return "bindo";
		
	}
	public List<com.rohit.web.Model.City> getCities() {
		MapSqlParameterSource parameterSource = new  MapSqlParameterSource();
		parameterSource.addValue("jaghe","IND");
				return template.query("select * from city where CountryCode=:jaghe",parameterSource, new RowMapper<City>() {

					public City	 mapRow(ResultSet rs, int arg1) throws SQLException {
						// TODO Auto-generated method stub
						City city = new City();
						city.setId(rs.getInt("id"));
						city.setCountryCode(rs.getString("countryCode"));
						city.setDistrict(rs.getString("district"));
						city.setName(rs.getString("name"));
						city.setPopulation(rs.getLong("population"));
						return city;
					}

				});
			}
}
