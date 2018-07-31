package com.student.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.student.bean.Teacher;

public class TeacherMapper  implements RowMapper<Teacher> {


	public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
		Teacher teacher = new Teacher();

		teacher.setId(rs.getInt(1));
		teacher.setName(rs.getString(2));
		teacher.setAge(rs.getInt(3));
		teacher.setSex(rs.getString(4));
		System.out.println(teacher);
		return teacher;
	}
}
