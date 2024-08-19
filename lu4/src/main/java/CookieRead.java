 import java.io.*;import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;import javax.servlet.http.*;
 @WebServlet("/CookieRead")
 public class CookieRead extends HttpServlet {
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
 ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out=response.getWriter();
 Cookie[] cookie=request.getCookies();
 try {
 for(int i=0;i<cookie.length;i++) {
 out.print(cookie[i].getName()+" is "+cookie[i].getValue());
 }}
 catch(NullPointerException e)
 {
 out.print("No cookie has been found");
 }}}
 
