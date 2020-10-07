package com.choa.point;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.choa.util.DBConnector;

public class PointDAO {
	
	private DBConnector dbConnector;
	
	public PointDAO() {
		dbConnector = new DBConnector();
	}
	
	//insert
	public int pointInsert(PointDTO pointDTO) throws Exception {
		
		Connection con = dbConnector.getConnect();
		
		//4. SQL문 생성
		String sql = "insert into point values(?, ?, ?, ?, ?, ?, ?)";
		
		//5. 미리전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//6. ? 세팅
		st.setString(1, pointDTO.getName());
		st.setInt(2, pointDTO.getNum());
		st.setInt(3, pointDTO.getKor());
		st.setInt(4, pointDTO.getEng());
		st.setInt(5, pointDTO.getMath());
		st.setInt(6, pointDTO.getTotal());
		st.setDouble(7, pointDTO.getAvg());
		
		//7. 최종 전송 후 결과 처리
		int num = st.executeUpdate();
		
		//8. 연결 해제
		st.close();
		con.close();
		
		return num;
		
	}

}
