package com.mitinyova.myjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mitinyova.animals.Cat;

@SuppressWarnings("deprecation")
@Repository
public class JdbcCatsDAO implements CatsDAO {
	private static final String SQL_INSERT_CAT = "insert into cats (name,age) values(?,?)";

	private static final String SQL_SELECT_CAT_BY_ID = "select id, name, age from cats where id = ?";

	@Autowired
	private SimpleJdbcTemplate jdbcTemplate;

	public void addCat(Cat cat) {
		jdbcTemplate.update(SQL_INSERT_CAT, cat.getName(), cat.getAge());
	}

	public Cat getCatById(int id) {
		return jdbcTemplate.queryForObject(SQL_SELECT_CAT_BY_ID, new ParameterizedRowMapper<Cat>() {
			public Cat mapRow(ResultSet rs, int rowNum) throws SQLException {
				Cat cat = new Cat();
				cat.setId(rs.getInt(1));
				cat.setName(rs.getString(2));
				cat.setAge(rs.getInt(3));
				return cat;
			}
		}, id);

	}

}
