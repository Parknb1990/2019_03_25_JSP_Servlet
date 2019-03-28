/*
 * 날짜 : 2019. 03. 25
 * 이름 : 박노빈
 * 내용 : Servlet 생명주기 예제.
 */

package com.javalec.ex;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLifeCycle
 */
@WebServlet("/ServletLifeCycle")
public class ServletLifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */ 
    public ServletLifeCycleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    //.. init() 메소드는 서블릿에서 최초 요청시 한 번 실행된다.
    @Override
    public void init() throws ServletException {
    	
    	System.out.println("init");
    }
    
    //..  자원 해제를 위한 메소드, 실행중인 서버를 중지하면 destroy() 메소드를 호출하여 consloe창에 destroy가 출력된다.
    @Override
    public void destroy() {
    	System.out.println("destory");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}
	
	
}
