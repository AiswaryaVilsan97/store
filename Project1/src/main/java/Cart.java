import jakarta.servlet.ServletException;
//import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        //request.getRequestDispatcher("page.html").include(request, response);  
          
        //Cookie ck[]=request.getCookies();  
        //if(ck!=null){  
        //String name=ck[0].getValue();  
         
		int p1=Integer.parseInt(request.getParameter("p1"));
		int r1=Integer.parseInt(request.getParameter("r1"));
		
		int p2=Integer.parseInt(request.getParameter("p2"));
		int r2=Integer.parseInt(request.getParameter("r1"));
		
		int p3=Integer.parseInt(request.getParameter("p3"));
		int r3=Integer.parseInt(request.getParameter("r1"));
		
		
		int total=(p1*r1)+(p2*r2)+(p3*r3);
		//out.print("Hi, "+name);
		out.println("total price is" + total);
        out.close();  
    }  
}