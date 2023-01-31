package org.exception;

import java.util.Scanner;
import java.util.logging.*;
class Point
{
	public static void main(String []args) 
	{
		String x; 
		String y;
		Scanner sc=new Scanner(System.in);
		Logger log=Logger.getLogger("com.api.jar");
		try {
			
		
		log.info("Enter the value of x:");
		x=sc.next();
		log.info("Enter the value of y:");
		y=sc.next();
		Space s1=new Space(x,y);
		s1.check();
		log.info("Object 1");
		s1.display();
		Space s2=(Space)s1.clone();
		log.info("Obect");
		s2.display();
		sc.close();
	}
		catch(CloneNotSupportedException e)
		{
			log.info("Clone is not Suported");
		}
	}
}
class Space implements Cloneable
{
	String x;
	String y;
	Logger log=Logger.getLogger("com.api.jar");

	Space(String x,String y)
	{
		this.x=x;
		this.y=y;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	public void check()
	{
		if(x.equals(y))
		{
			log.info("Both are equal");
		}
		else
		{
			log.info("Both are not equal");
		}
	}
	public void display()
	{
		log.info(x);
		log.info(y);

	}
}