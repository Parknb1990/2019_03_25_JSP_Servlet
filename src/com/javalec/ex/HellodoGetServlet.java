/*
 *  ��¥ : 2019. 03. 25
 *  �̸� : �ڳ��
 *  ���� : doGet ����� �̿��� Hello World ��� ����.
 *      
 */

package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HW")
public class HellodoGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HellodoGetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//.. �� �������� ���� ���� ���� get ����� ȣ��.
		//.. consoleâ�� doGet�� ���.
		System.out.println("doGet");
		
		//.. MIME Ÿ��(������ html��)�� ĳ���� ���ڵ� ����.
		response.setContentType("text/html, charset=utf-8");
		
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<body>");
		writer.println("Hello World~~");
		writer.println("</body>");
		writer.println("</head>");
		writer.println("</html>");
		
		writer.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}

}
