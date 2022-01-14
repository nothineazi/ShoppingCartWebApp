import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
        final String name = "yasser";
        final String password = "batman";


        protected void doPost (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {
            String username = request.getParameter("username-field");
            String pw = request.getParameter("pw-field");

            if (username.equals(name) && pw.equals((password))) {
                HttpSession session= request.getSession();
                session.setAttribute("currentUser", username);
                session.setMaxInactiveInterval(30*60);

                RequestDispatcher rd = request.getRequestDispatcher("LoginSuccessful");
                rd.forward(request, response);
            } else {
                response.sendRedirect("Login.html");
            }
        }

        protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {

        }
    }

