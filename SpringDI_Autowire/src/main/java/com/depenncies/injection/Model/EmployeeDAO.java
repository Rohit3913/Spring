package com.depenncies.injection.Model;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("empDAO")
public class EmployeeDAO {

	NamedParameterJdbcTemplate jdbcTemplate;

	public NamedParameterJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public boolean createEmp(Employee employee) {
		BeanPropertySqlParameterSource parameterSource = new BeanPropertySqlParameterSource(employee);
		return jdbcTemplate.update(
				"insert into employee(empname,empcountry,empprofession) values (:empName,:empCountry,:empProfession)",
				parameterSource) == 1;

	}
@Transactional
	public int[] batchUpdate(List <Employee> employees){
		
		SqlParameterSource [] batchArgs = SqlParameterSourceUtils.createBatch(employees.toArray());
		return	jdbcTemplate.batchUpdate("insert into employee(empname,empcountry,empprofession) values (:empName,:empCountry,:empProfession)", batchArgs );
		
	}

@Transactional
public int[] batchUpdateWithId(List <Employee> employees){
	
	SqlParameterSource [] batchArgs = SqlParameterSourceUtils.createBatch(employees.toArray());
	return	jdbcTemplate.batchUpdate("insert into employee(id,empname,empcountry,empprofession) values (:id,:empName,:empCountry,:empProfession)", batchArgs );
	
}
}
