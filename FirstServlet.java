

import java.io.IOException;
import java.io.PrintWriter;

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
initParams = {@WebInitParam(name="id",value="1"),@WebInitParam(name="name",value="pankaj")})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public static final String CSS_START= "<html><head>";
	public static final String CSS_END="</head></html>";
	public static final String HTML_START="<html><body>";
	public static final String HTML_END="</body></html>";
 
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
		
	PrintWriter out = response.getWriter();
	
	out.println(CSS_START + " <style type=\"text/css\">\r\n" + 
			"        center { color: yellow;\r\n" + 
			"font-size:150%;		}\r\n" + 
			"\r\n" + 
			" body {background-color: maroon; }\r\n" + 
			"\r\n" + 
			" </style>"+ CSS_END );
	
	out.println(HTML_START + "<form method=\"post\" action=\"FirstServlet\">\r\n" + 
			"\r\n" + 
			"<center>Enter numbers of jobs </center>\r\n" + 
			"<br/>\r\n" + 
			"<center>\r\n" + 
			"Number of jobs:<input type=\"numbers\" size=\"10\"  name=\"name\"> \r\n" + 
			"<br/>\r\n" + 
			"<br />\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"<input type=\"submit\" value=\"Send\"> \r\n" + 
			"\r\n" + 
			"</center>\r\n" + 
			"</form>" +HTML_END);

	for(int i=0;i<10;i++) {
		//create runnable object and thread to run them
		Myclass demo1=new Myclass(i); 
		Thread t1=new Thread(demo1);
		//start the thread
		t1.start(); 
	}
		
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
