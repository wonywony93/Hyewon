package com.bit.myapp03.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

import com.bit.myapp03.model.entity.GuestVo;

public class GuestDaoImpl02 implements GuestDao {

	Logger log=Logger.getLogger(getClass());
	JdbcTemplate JdbcTemplate;
	
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<GuestVo> selectAll() throws Exception {
		String sql="select * from guest order by sabun";
		return JdbcTemplate.query(sql, new RowMapper<GuestVo>() {

			@Override
			public GuestVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				GuestVo bean=new GuestVo(
						rs.getInt(1),
						rs.getString(2),
						rs.getDate(3),
						rs.getInt(4)
						);
				log.debug(rowNum+"¹øÂ°:"+bean);
				return bean;
			}
			
		});
	}

	@Override
	public GuestVo selectOne(int pk) throws Exception {
		String sql="SELECT * FROM GUEST WHERE SABUN=?";
		return JdbcTemplate.queryForObject(sql, new Object[] {pk}, new RowMapper<GuestVo>() {

			@Override
			public GuestVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				GuestVo bean=new GuestVo(
						rs.getInt(1),
						rs.getString(2),
						rs.getDate(3),
						rs.getInt(4)
						);
				log.debug(rowNum==1);
				log.debug(bean);
				return bean;
			}
			
		});
	}

	@Override
	public int insertOne(final GuestVo bean) throws Exception {
		final String sql="insert into guest values (?,?,sysdate,?)";
		return JdbcTemplate.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, bean.getSabun());
				pstmt.setString(2, bean.getName());
				pstmt.setInt(3, bean.getPay());
				return pstmt;
			}
			
		});
	}

	@Override
	public int updateOne(GuestVo bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int pk) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
