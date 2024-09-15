package vn.iotstar.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.iotstar.models.User;

import java.io.IOException;

@WebServlet(urlPatterns = "/forgetPass")
public class ForgetPassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ForgetPassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/forgetPass.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession(false);
		String alertMsg = "";
		
		String username = (String) session.getAttribute("username");
		 UserService service = new UserServiceImpl();
	        boolean reset = service.forgetPass(username, password);
	        if(reset){
	        	request.getRequestDispatcher("/views/login.jsp").forward(request, response);
	        }else{
	        	System.out.print(password);
	            alertMsg = "Lỗi";
	            request.setAttribute("alert", alertMsg);
	            request.getRequestDispatcher("/views/test.html").forward(request, response);
	        }
		
	}

}
