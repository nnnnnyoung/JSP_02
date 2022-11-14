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
@WebServlet("/lotto2")
public class lotto2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lotto2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String url="./lotto/lotto2.jsp";
		RequestDispatcher dispatcher=request.getRequestDispatcher(url);
		int[] lottoNumber= new int[6];
		for(int i=0; i<6; i++) {
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
