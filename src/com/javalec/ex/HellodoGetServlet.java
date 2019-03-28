/*
 *  날짜 : 2019. 03. 25
 *  이름 : 박노빈
 *  내용 : doGet 방식을 이용한 Hello World 출력 예졔.
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
		
		//.. 웹 브라우저를 통해 직접 들어가면 get 방식이 호출.
		//.. console창에 doGet이 출력.
		System.out.println("doGet");
		
		//.. MIME 타입(응답을 html로)과 캐릭터 인코딩 지정.
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
