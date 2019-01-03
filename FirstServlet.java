package com.ibm.executabe;


import java.io.IOException;



import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(description = "My First Servlet", urlPatterns = { "/FirstServlet" , "/FirstServlet.do"},
initParams = {@WebInitParam(name="id",value="1")})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
     
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
	

	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
		int numberOfThreads=Integer.parseInt(request.getParameter("numberOfThreads"));
		int listOfjob=Integer.parseInt(request.getParameter("listOfjob"));
		ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
		
	
	PrintWriter out = response.getWriter();
	

		for(int i=0;i<listOfjob;i++) {
			//create runnable object and thread to run the
			job demo1=new job(i); 
			//	Thread t1=new Thread(demo1);
			
			executor.submit(demo1);
			//start the thread
		//t1.start(); 
			response.getWriter().println("job number" +i);
			//response.getWriter().println("numberOfThreads" +numberOfThreads);
			
			
		
			}
		
	
	
	
	
}

	
	}


