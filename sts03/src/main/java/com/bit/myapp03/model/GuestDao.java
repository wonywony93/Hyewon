package com.bit.myapp03.model;

import java.util.List;

import javax.sql.DataSource;

import com.bit.myapp03.model.entity.GuestVo;

public interface GuestDao {
	
	 
	List<GuestVo> selectAll() throws Exception;
	
	GuestVo selectOne(int pk) throws Exception;
	
	int insertOne(GuestVo bean) throws Exception;
	
	int updateOne(GuestVo bean) throws Exception;
	
	int deleteOne(int pk) throws Exception;
}
