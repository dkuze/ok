 import java.io.*;import javax.servlet.ServletException;
 
 import javax.servlet.annotation.WebServlet;import javax.servlet.http.*;
 @WebServlet("/CookieAction")
 public class CookieAction extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out
 =response.getWriter();
 String name=request.getParameter("name1");
 Cookie ck=new Cookie("username",name);
 ck.setMaxAge(120);
 response.addCookie(ck);
 }
 }