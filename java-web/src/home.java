import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet ("/index.html")
public class home extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if (username.equals("admin")== true && password.equals("1")== true) 
			req.setAttribute("notifycation", "dang nhap thanh cong");
		else
			req.setAttribute("notifycation", "dang nhap that bai");
		req.getRequestDispatcher("/notifycation.jsp").forward(req, resp);
	}
};

