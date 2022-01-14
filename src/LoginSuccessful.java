import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginSuccessful extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Cookie[] cookies = request.getCookies();
    String user = null;
    if(cookies)==null{
        response.sendRedirect("Login.html");
    }
    else{
        for(Coolie cookie:cookies){
            if(cookie.getname().equals("currentUser")){
                user=cookie.getValue();
            }
        }
    }
        PrintWriter out=response.getWriter();
        out.println("<h1>Welcome, " +user+ "</h1>");
        out.println(<form method=\"post\"action=\"LogoutServlet\"> <input type=\"submit\"value=\"Log Out\"> </form>);
           

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
