package org.exception;

import java.util.Scanner;
import java.util.logging.*;


class Credit
{
	public static void main(String []args) throws CloneNotSupportedException
	{
		String name;
		String num;
		String date;
		String y;
		Scanner sc=new Scanner(System.in);
		Logger log=Logger.getLogger("com.api.jar");
		try
		{
			log.info("Enter the Cardholder name");
			name=sc.next();
			log.info("Enter the Card number");
			num=sc.next();
			log.info("Enter the expiration date");
			date=sc.next();
			Card s1=new Card(name,num,date);
			s1.display();
			log.info("Enter the Card number for checking");
			y=sc.next();
			s1.check(y);
			Card s2=(Card)s1.clone();
			log.info("Cloned Object\n");
			s2.display();
			
		}
		catch(CloneNotSupportedException e)
		{
			log.info("Clone not supported");
		}
		sc.close();
	}
}
class Card implements Cloneable
{
	String name;
	String num;
	String date;
	String s="com.api.jar";
	Card(String name,String num,String date)
	{
		this.name=name;
		this.num=num;
		this.date=date;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	public void check(String y)
	{
		Logger log=Logger.getLogger(s);

		if(num.equals(y))
		{
			log.info("True\n");
		}
		else
		{
			log.info("False\n");
		}
	}
	public void display()
	{
		Logger log=Logger.getLogger(s);

		log.info(name);
		log.info(num);
		log.info(date);


	}
}
