 import java.io.*;import javax.servlet.ServletException;

 import javax.servlet.annotation.WebServlet;import javax.servlet.http.*;
 @WebServlet("/LoginServlet")
 public class LoginServlet extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
 ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out=response.getWriter();
 String uname=request.getParameter("username");
 String upass=request.getParameter("password");
 out.print("Hello <b>"+uname+"</b>");
 out.print("<form action='WelcomeServlet' method=\"POST\">");
 out.print("<input type='hidden' name='uname' value='"+uname+"'>");
 out.print("<input type='submit' value='GO'>");
 out.print("</form>");
 out.close();
 }}
 