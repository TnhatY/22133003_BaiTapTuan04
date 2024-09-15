package vn.iotstar.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.iotstar.models.Constant;
import vn.iotstar.models.User;


import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginControler
 */


@WebServlet(urlPatterns = "/login")
public class LoginControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginControler() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("account") != null) {
			response.sendRedirect(request.getContextPath() + "/waiting");
			return;
		}
		request.getRequestDispatcher("/views/login.jsp").forward(request, response);
	}

	private void saveRemeberMe(HttpServletResponse response, String username) {
		Cookie cookie = new Cookie(Constant.COOKIE_REMEMBER, username);
		cookie.setMaxAge(30 * 60);
		response.addCookie(cookie);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isRememberMe = false;
		String remember = request.getParameter("remember");

		if ("on".equals(remember)) {
			isRememberMe = true;
		}
		String alertMsg = "";

		if (username.isEmpty() || password.isEmpty()) {
			alertMsg = "Tài khoản hoặc mật khẩu không được rỗng";
			request.setAttribute("alert", alertMsg);
			request.getRequestDispatcher("/views/login.jsp").forward(request, response);
			return;
		}
		
		 UserService service = new UserServiceImpl();
	        User user = service.login(username, password);
	        if(user!=null){
	            HttpSession session = request.getSession(true);
	            session.setAttribute("account", user);
	            if(isRememberMe){
	                saveRemeberMe(response, username);
	            }           
	            response.sendRedirect(request.getContextPath()+"/waiting");
	        }else{
	        	
	            alertMsg = "Tài khoản hoặc mật khẩu không đúng";
	            request.setAttribute("alert", alertMsg);
	            request.getRequestDispatcher("/views/test.html").forward(request, response);
	        }
		
		
	}

}
