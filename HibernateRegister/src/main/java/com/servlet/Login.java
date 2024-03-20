package com.servlet;

import java.io.IOException;

import org.hibernate.Session;

import com.conn.HibernateUtil;

import dao.EmpDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/login")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		EmpDao empDao=new EmpDao(HibernateUtil.getSessionFactory());
		boolean f=empDao.loginEmp(email, password);
		HttpSession session=req.getSession();
		if (f) {
			System.out.println("success");
			resp.sendRedirect("home.jsp");
		}else {
			System.out.println("Something wrong on server");
			session.setAttribute("msg", "Invalid email and password");
			resp.sendRedirect("login.jsp");
		}
		
		
	}

	
	
}
