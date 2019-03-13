package testselect;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Company;
import beans.Employee;



public class Testselect {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session se = sf.openSession();
		
		//one-to-many
		/*String hql="from Company c";
	      Query q=se.createQuery(hql);
	       List l=q.list();
	       Iterator it=l.iterator();
	       while(it.hasNext())
	       {
	    	   Object o=it.next();
	    	   Company c=(Company)o;
	    	   
	    	   System.out.println("cmpid="+c.getCid());
	    	   System.out.println("cmpname="+c.getCname());
	    	   System.out.println("====================");
	    	   Set s=c.getComp();
	    	   Iterator it1=s.iterator();
	    	   while(it1.hasNext())
	    	   {
	    		   Employee e=(Employee)it1.next();
	    		   System.out.println("empid:="+e.getEid());
	    		   System.out.println("emp name:="+e.getEname());
	    		   
	    	   }
	       }*/
	       //many to one
	       String hql="from Employee e";
		      Query q=se.createQuery(hql);
		       List l=q.list();
		       Iterator it=l.iterator();
		       while(it.hasNext())
		       {
		    	   Object o=it.next();
		    	   Employee e=(Employee)o;
		    	   
		    	   System.out.println("empid="+e.getEid());
		    	   System.out.println("empname="+e.getEname());
		    	   System.out.println("====================");
		    	   
		    	     Company c=e.getCoem();
		    		   System.out.println("cmpid:="+c.getCid());
		    		   System.out.println("cmp name:="+c.getCname());
		    		   
		    	   }
		       
	       se.close();
	       sf.close();
	}

}
