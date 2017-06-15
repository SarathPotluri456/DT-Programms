package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
class EmployeeMain
{
	public static void main(String arg[])
	{

	 //creating configuration object  
    	Configuration cfg=new Configuration();  
    	cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      System.out.println("Configaration Established");
    	//creating seession factory object  
  	SessionFactory factory=cfg.buildSessionFactory();  
      
    	//creating session object  
    	Session session=factory.openSession();  
      
   	 //creating transaction object  
    	Transaction t=session.beginTransaction();  

	Employee obj=new Employee();

	obj.setEmpid(1001);
	obj.setEmpname("Sunil");
	obj.setAdd("Hyderabad");

	session.save(obj);

	 t.commit();//transaction is commited  
    	 session.close();  

	System.out.println("Object Saved in Database");

	}
}

