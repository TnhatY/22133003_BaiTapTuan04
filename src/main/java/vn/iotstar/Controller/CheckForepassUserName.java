package vn.iotstar.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.iotstar.models.User;

import java.io.IOException;

/**
 * Servlet implementation class CheckForepassUserName
 */
@WebServlet(urlPatterns="/checkuser")
public class CheckForepassUserName extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CheckForepassUserName() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/views/checkUser.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		boolean isRememberMe = false;
		HttpSession session = request.getSession();
		 session.setAttribute("username", username);
		 UserService service = new UserServiceImpl();
		String alertMsg = "";

		if (username.isEmpty()) {
			alertMsg = "Vui lòng nhập tài khoản";
			request.setAttribute("alert", alertMsg);
			request.getRequestDispatcher("/views/checkUser.jsp").forward(request, response);
			return;
		}
		if (service.checkExistUsername(username)) {
			request.getRequestDispatcher("/views/forgetPass.jsp").forward(request, response);
		}else {
			alertMsg = "Không có tài khoản này";
			request.setAttribute("alert", alertMsg);
		}

	}

}
