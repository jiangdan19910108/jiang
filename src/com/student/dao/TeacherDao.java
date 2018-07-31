package com.student.dao;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;

import com.student.bean.Student;
import com.student.bean.Teacher;
import com.student.mapper.StudentMapper;
import com.student.mapper.TeacherMapper;

public class TeacherDao {


	/**
	 * @Fields jdbcTemplate
	 */
	private JdbcTemplate jdbcTemplate;

	/**
	 * spring提供的类
	 *
	 * @param jdbcTemplate
	 * 返回值类型： void
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 查询所有学生
	 * @return 返回值类型： List<Student>
	 */
	public ArrayList<Teacher> queryAll() {
		String sql = "select id,name,age,sex form tecaher";
		//将查询结果映射到T类中，添加到list中，并返回
		return (ArrayList<Teacher>) jdbcTemplate.query(sql, new TeacherMapper());
	}

	/**
	 * 通过姓名查询
	 * @param name
	 * @return 返回值类型： List<Teacher>
	 */
	public List<Teacher> queryByName(String name) {
		String sql = "select id,name,age,sex from teacher where name like '%" + name + "%'";

		return jdbcTemplate.query(sql, new TeacherMapper());
	}

	/**
	 * 添加学生
	 * @param student
	 * @return 返回值类型： boolean
	 */
	public boolean addStu(Teacher teacher) {
		String sql = "insert into teacher(id,name,age,sex) values(0,?,?,?)";

		return jdbcTemplate.update(sql,
				new Object[] { teacher.getId(), teacher.getName(), teacher.getAge(),teacher.getSex()},

				new int[] { Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.VARCHAR }) == 1;
	}

	/**
	 * 删除学師
	 * @param id
	 * @return 返回值类型： boolean
	 */
	public boolean deleteStu(Integer id) {

		String sql = "delete from teacher where id = ?";
		return jdbcTemplate.update(sql, id) == 1;
	}

	/**
	 * 更新学生信息
	 * @param student
	 * @return 返回值类型： boolean
	 */
	public boolean updateStu(Teacher teacher) {

		String sql = "update teacher set name=? ,age=?,sex = ?  where id = ?";
		Object stuObj[] = new Object[] {teacher.getName(), teacher.getAge(), teacher.getSex()};

		return jdbcTemplate.update(sql, stuObj) == 1;
	}


}
