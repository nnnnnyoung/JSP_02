package com.human.lotto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lotto
 */
@WebServlet("/lotto4")
public class lotto4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lotto4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String url="./lotto/lotto4.jsp";
		RequestDispatcher dispatcher=request.getRequestDispatcher(url);
		int[] lottoNumber= new int[6];
		System.out.println("ddsfgs");
		
		lottoNumber[0]= Integer.parseInt(request.getParameter("1num"));
		lottoNumber[1]= Integer.parseInt(request.getParameter("2num"));
		for(int i=2; i<lottoNumber.length; i++) {
			lottoNumber[i]=(int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				if(lottoNumber[i]==lottoNumber[j]) {
					i--;
				}
			}
		}
				
		request.setAttribute("lottoNumber", lottoNumber);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
