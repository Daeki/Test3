package com.choa.s1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.choa.point.PointDTO;
import com.choa.point.PointService;

/**
 * Servlet implementation class PointController
 */
@WebServlet("/PointController")
public class PointController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PointService pointService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PointController() {
        super();
        pointService = new PointService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Encoding
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//
		
		String path = request.getRequestURI();
		
		path = path.substring(path.lastIndexOf("/"));
		
		String info="";
		
		if(path.equals("/pointList.point")) {
			System.out.println("Point List");
		}else if(path.equals("/pointInput.point")) {
			System.out.println("Point Input");
			info = "./pointInput.jsp";
		}else if(path.equals("/pointInputProcess.point")) {
			System.out.println("point process");
			PointDTO pointDTO = new PointDTO();
			pointDTO.setName(request.getParameter("name"));
			pointDTO.setNum(Integer.parseInt(request.getParameter("num")));
			pointDTO.setKor(Integer.parseInt(request.getParameter("kor")));
			pointDTO.setEng(Integer.parseInt(request.getParameter("eng")));
			pointDTO.setMath(Integer.parseInt(request.getParameter("math")));
						
			try {
				pointService.pointInsert(pointDTO);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			System.out.println("Point Update");
		}
		
		RequestDispatcher view = request.getRequestDispatcher(info);
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
