/*
 * ��¥ : 2019. 03. 25
 * �̸� : �ڳ��
 * ���� : Servlet �����ֱ� ����.
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
    
    //.. init() �޼ҵ�� �������� ���� ��û�� �� �� ����ȴ�.
    @Override
    public void init() throws ServletException {
    	
    	System.out.println("init");
    }
    
    //..  �ڿ� ������ ���� �޼ҵ�, �������� ������ �����ϸ� destroy() �޼ҵ带 ȣ���Ͽ� consloeâ�� destroy�� ��µȴ�.
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
