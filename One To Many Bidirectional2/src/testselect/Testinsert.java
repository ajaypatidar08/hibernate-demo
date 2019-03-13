package testselect;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Company;
import beans.Employee;

public class Testinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		Company c=new Company();
		c.setCid(1);
		c.setCname("Tcs");
		Employee e1=new Employee();
	      e1.setEid(102);
	      e1.setEname("Ram");
	      e1.setCoem(c);
	    Employee e2=new Employee();
	    e2.setEid(103);
	    e2.setEname("Sanjay");
	    e2.setCoem(c);
	    
	    Company c1=new Company();
		c1.setCid(2);
		c1.setCname("wipro");
		Employee e3=new Employee();
	      e3.setEid(106);
	      e3.setEname("mohan");
	      e3.setCoem(c1);
	    Employee e4=new Employee();
	    e4.setEid(108);
	    e4.setEname("shankar");
	    e4.setCoem(c1);
	   //one to many
	   /* Set s=new HashSet();
	    s.add(e1);
	    s.add(e2);
	    s.add(e3);
	    s.add(e4);
	    c.setComp(s);*/
	   //Many to one
	    se.save(e1);
	    se.save(e2);
	    se.save(e3);
	    se.save(e4);
	    //se.save(c);
	    
	   tx.commit();
	   se.close();
	   System.out.println("one to many bidirectional done");
	   System.out.println(" many to one bidirectional done");
	   sf.close();
	
	
	
	}

}
