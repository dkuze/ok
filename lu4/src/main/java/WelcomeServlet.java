 import java.io.*;import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;import javax.servlet.http.*;
 
 @WebServlet("/WelcomeServlet")
 public class WelcomeServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
 public WelcomeServlet() {
 super();
 }
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
 ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out=response.getWriter();
 String uname=request.getParameter("uname");
 out.print("Welcome <b>"+uname+"</b><br>");
 out.print("We are happy of you");
 }}
 
