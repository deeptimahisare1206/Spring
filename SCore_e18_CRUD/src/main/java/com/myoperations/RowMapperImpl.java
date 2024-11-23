package com.myoperations;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st = new Student();
		st.setRoll(rs.getInt("sid"));
		st.setName(rs.getString(2));
		st.setPercent(rs.getFloat("percent"));
		return st;
	}
	
	

}
