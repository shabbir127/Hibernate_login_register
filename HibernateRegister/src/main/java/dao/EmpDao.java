package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entity.Emp;

public class EmpDao {
	
	private SessionFactory sessionFactory;

	public EmpDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	public boolean savEmp(Emp emp)
	{
		boolean f=false;
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		int i=(Integer)session.save(emp);
		
		if (i>0) {
			f=true;
		}
		tx.commit();
		session.close();
		return f;
	}
	
	public boolean loginEmp(String email,String password)
	{
		boolean f=false;
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		String hql="From Emp where email=:email And password =:password";
		Query<Emp> emp=session.createQuery(hql,Emp.class);
		emp.setParameter("email", email);
		emp.setParameter("password", password);
		Emp emp2=emp.uniqueResult();
		System.out.println(emp);
		if (emp2 != null ) {
			
			f=true;
		}
		
		
		
		return f;
	}
	
	

}
