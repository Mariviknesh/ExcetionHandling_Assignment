package org.exception;

import java.sql.*;
import java.util.logging.*;
import java.util.Scanner;

class Dbase{
	private static Dbase db = null;
	public static Dbase create()
	{
		if (db == null)
		{
			db = new Dbase();
		}
            

        return db;
	}
	Logger log=Logger.getLogger("com.api.jar");
	public Connection connect()
	{
		String pass;
		Scanner s=new Scanner(System.in);
		log.info("Enter the password:");
		pass=s.next();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/login","root",pass);
			if(con != null)
			{
				log.info("Connected");
			}
			else
			{
				log.info("Not Connected");
			}
			return con;
		}
		catch(Exception e)
		{
			log.info("Not Connected");
		}
		s.close();
		return null;
	}
	public void close(Connection con)
	{
		try
		{
		con.close();
		log.info("Closed");
		}
		catch(Exception e)
		{
			log.info("Not Closed");
		}
	}
	
	public static void main(String []args)
	{
		Logger log=Logger.getLogger("com.api.jar");
		Connection conn = null;
		int ch;
		Scanner s=new Scanner(System.in);
		Dbase db=create();
		Dbase db1=create();
		while(true)
		{
			log.info("1.Connect");
			log.info("2.Close");
			log.info("3.Exit");
			log.info("Enter your choice:");
			ch=s.nextInt();
			if(ch==1)
			{
				conn=db.connect();
				String s1=""+conn;
				log.info(s1);
			}
			else if(ch==3)
			{
				break;
			}
			else if(ch==2)
			{
				db1.close(conn);
			}
			
		}
		s.close();
	}
}

