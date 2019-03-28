package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextEx
 */
@WebServlet("/ServletContextEx")
public class ServletContextEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		response.setCharacterEncoding("UTF-8");
		
		//.. web.xml���Ͽ� ������ <context-param>�ȿ� �ִ� id�� pw, path�� ���
		// �����͸� ��� �������� ����ϱ� ���� servletcontext�� ���
		String id = getServletContext().getInitParameter("id");
		String pw = getServletContext().getInitParameter("pw");
		String path = getServletContext().getInitParameter("path");
		
		response.setContentType("text/html charset=utf-8");
		PrintWriter write = response.getWriter();
		
		write.println("<html><head></head><body>");
		write.println("���̵� : "+id+"<br>");
		write.println("��й�ȣ : "+pw+"<br>");
		write.println("path: "+path+"<br>");
		write.println("</body></html>");
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
