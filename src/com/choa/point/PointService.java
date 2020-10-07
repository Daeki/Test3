package com.choa.point;

public class PointService {
	private PointDAO pointDAO;
	
	public PointService() {
		pointDAO = new PointDAO();
	}
	
	
	public void pointInsert(PointDTO pointDTO) throws Exception {
		//사전작업
		//총점과 평균 계산
		pointDTO.setTotal(pointDTO.getKor()+pointDTO.getEng()+pointDTO.getMath());
		pointDTO.setAvg(pointDTO.getTotal()/3.0);
		
		int result = pointDAO.pointInsert(pointDTO);
		System.out.println(result+" ----  1이상이면 성공 아니면 실패");
		
	}

}
