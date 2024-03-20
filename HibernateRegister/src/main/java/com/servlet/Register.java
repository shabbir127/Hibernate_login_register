package com.servlet;

import java.io.IOException;

import com.conn.HibernateUtil;
import com.entity.Emp;

import dao.EmpDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/register")
public class Register extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String department=req.getParameter("department");
		String salary=req.getParameter("salary");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		Emp emp=new Emp(name,department,salary,email,password);
		System.out.println(emp);
		
		EmpDao empDao=new EmpDao(HibernateUtil.getSessionFactory());
		
		boolean f=empDao.savEmp(emp);
		
		HttpSession session=req.getSession();
		if (f) {
			session.setAttribute("msg", "Emp register Successfull");
			System.out.println("success");
			resp.sendRedirect("login.jsp");
			
		}else {
			session.setAttribute("msg", "Something went wrong server");
			System.out.println("something went wrong server");
			
		}
		
		
		
		
	}

	
	
}
