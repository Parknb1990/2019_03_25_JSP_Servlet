/*
 * ��¥ : 2019. 03. 25
 * �̸� : �ڳ��
 * ���� : formAction.jsp ���Ͽ��� ������ �����͸� �޾� ����ϴ� ����.
 */

package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formActionEx
 */


@WebServlet("/formActionEx")
public class formActionExServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formActionExServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		
		//.. Post��Ŀ��� setCharacterEncoding�� �������� ������ ��½� �ѱ۱��� ������ �߻�
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//.. formAction.jsp ���Ͽ��� ������ name, id�� password�� �޾� ����
		String uname = request.getParameter("uname");
		String uid = request.getParameter("uid");
		String upass = request.getParameter("upass");
		
		//.. checkbox�� �������� �����͸� �ѹ��� ������ �� �־ �迭�� �̿��� ����
		String[] hobbys = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		response.setContentType("text/html charset=UTF-8");
		PrintWriter write = response.getWriter();
		
		write.println("<html><head></head><body>");
		write.println("�̸� : "+uname+"<br>");
		write.println("���̵� : "+uid+"<br>");
		write.println("��й�ȣ : "+upass+"<br>");
		write.println("��� : "+Arrays.toString(hobbys)+"<br>");
		write.println("���� : "+major+"<br>");
		write.println("�������� : "+protocol+"<br>");
		write.println("</body></html>");
		
		
	}

}
