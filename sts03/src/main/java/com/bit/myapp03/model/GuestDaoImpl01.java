package com.bit.myapp03.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.bit.myapp03.model.entity.GuestVo;

public class GuestDaoImpl01 implements GuestDao {
	Logger log=Logger.getLogger(getClass());
	
	DataSource dataSource;
	//"dataSource"
	public GuestDaoImpl01() {
			log.info("dao»ý¼º");
	}
	
	
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	
	@Override
	public List<GuestVo> selectAll() throws Exception {
		List<GuestVo> list=new ArrayList<GuestVo>();
		String sql="select * from guest";
		try(Connection conn=dataSource.getConnection()){
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(new GuestVo(
						rs.getInt(1),
						rs.getString(2),
						rs.getDate(3),
						rs.getInt(4)
						
						));
			}
		}
		
		return list;
	}

	@Override
	public GuestVo selectOne(int pk) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertOne(GuestVo bean) throws Exception {
		// TODO Auto-generated method stub
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
