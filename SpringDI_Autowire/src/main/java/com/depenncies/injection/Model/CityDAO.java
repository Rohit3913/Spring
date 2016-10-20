package com.depenncies.injection.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component("cityDAO")
public class CityDAO {
	
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	@Autowired
	public void setTemplate(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}
	
	public List<City> getCities(){
	return	template.query("select * from city", new RowMapper<City>() {

			public City mapRow(ResultSet arg0, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				City city= new City();
				city.setId(arg0.getInt("id"));
				city.setCountryCode(arg0.getString("countryCode"));
				city.setDistrict(arg0.getString("district"));
				city.setName(arg0.getString("name"));
				city.setPopulation(arg0.getLong("population"));
				return city;
			}
			
		});
	}
	
	
}
