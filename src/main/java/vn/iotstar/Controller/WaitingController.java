package vn.iotstar.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.iotstar.models.User;

import java.io.IOException;

@WebServlet(urlPatterns="/waiting")
public class WaitingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public WaitingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session= request.getSession();
		 if(session != null && session.getAttribute("account") != null) {
		 User u=(User) session.getAttribute("account");
		 request.setAttribute("username", u.getUserName());
		 if(u.getRoleid()==1) {
		 response.sendRedirect(request.getContextPath()+"/views/admin.jsp");
		 }else if(u.getRoleid()==2) {
		 response.sendRedirect(request.getContextPath()+"/views/manager.jsp");
		 }else if(u.getRoleid()==3){
		 response.sendRedirect(request.getContextPath()+"/views/home.jsp");
		 }
		 }else {
		 response.sendRedirect(request.getContextPath()+"/login");
		 }
		 
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
