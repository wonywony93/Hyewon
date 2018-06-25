package com.bit.myapp03.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

import com.bit.myapp03.model.entity.GuestVo;

public class GuestDaoImpl03 extends SimpleJdbcDaoSupport implements GuestDao {



	@Override
	public List<GuestVo> selectAll() throws Exception {
		String sql="SELECT * FROM GUEST ORDER BY SABUN";
		return getSimpleJdbcTemplate().query(sql, new RowMapper<GuestVo>() {

			@Override
			public GuestVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				GuestVo bean=new GuestVo(
						rs.getInt(1),
						rs.getString(2),
						rs.getDate(3),
						rs.getInt(4)
						);
				return bean;
			}
		});
	}

	@Override
	public GuestVo selectOne(int pk) throws Exception {
		return null;
	}

	@Override
	public int insertOne(GuestVo bean) throws Exception {

		
//		DataSourceTransactionManager tm=new DataSourceTransactionManager();
//		TransactionTemplate template=new TransactionTemplate(tm);
//		template.execute(action);
//		dataSource=tm.getDataSource();
/*		try(Connection conn=dataSource.getConnection()){
			
		}*/
		return 0;
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
