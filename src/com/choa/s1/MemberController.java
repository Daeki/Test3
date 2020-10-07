package com.choa.s1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// String path = request.getRequestURL().toString();
		// System.out.println(path);
		// String [] ar = path.split("/");
		// path =ar[ar.length-1];
		// path = path.substring(path.lastIndexOf("/")+1);
		// System.out.println(path);
		// String path = request.getPathInfo();
		System.out.println(request.getRequestURL());
		String path = request.getRequestURL().toString();
		path = path.substring(path.lastIndexOf("/"));
		
		System.out.println(path);
		
		String info="";
		
		// split, subString
		if(path.equals("/memberList.member")) { 
			System.out.println("member List");
			info = "./memberList.jsp";
		}else if(path.equals("/memberJoin.member")) {
			System.out.println("Member Join");
			info = "./memberJoin.jsp";
	
		}else {
			System.out.println("MemberLogin");
			info = "./memberLogin.jsp";
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
		//ClassNotFoundException
	}

}
