package com.bit.myapp04.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.myapp04.model.entity.GuestVo;
import com.ibatis.sqlmap.client.SqlMapClient;

public class GuestDaoImpl02 implements GuestDao {

	
	/*
	 * 
	 * ibatis framework����
	 * (non-Javadoc)
	 * @see com.bit.myapp04.model.GuestDao#selectAll()
	 */
	
	
	SqlMapClient sqlMapClient;

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}
	
	
	@Override
	public List<GuestVo> selectAll() throws SQLException {
		return sqlMapClient.queryForList("selectAll");
	}

	@Override
	public GuestVo selectOne(int sabun) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertOne(GuestVo bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(GuestVo bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int sabun) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
