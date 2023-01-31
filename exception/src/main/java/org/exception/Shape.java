package org.exception;

import java.util.Scanner;
import java.util.logging.*;


public class Shape {
  public static void main(String []args)
  {
      double d1;
      double d2;
      double d3;
      String etd="Enter the dimensions";
      String are="Area=";
      String per="Perimeter=";
      String ra;
      String rp;
      Scanner mysc=new Scanner(System.in);
      Logger log=Logger.getLogger("com.api.jar");

	  try
	  {
      for(int i=0;i<4;i++)
      {
    		  log.info("Enter the name of the shape:");
    	      String name=mysc.next();
    	      if((name.equals("rectangle")))
    	      {
    	    	  log.info(etd);
    	          d1=mysc.nextDouble();
    	          d2=mysc.nextDouble();
    	          BasicShape b=new BasicShape(name,d1,d2);
    	          b.findArea(name,d1,d2);
    	          b.findPerimeter(name,d1,d2);
    	          ra=""+b.retArea();
    	          log.info(ra);
    	          rp=""+b.retPeri();
    	          log.info(per);
    	          log.info(rp);
    	          b=null;

    	      }
    	      else if(name.equals("triangle"))
    	      {
    	    	  log.info(etd);
    	          d1=mysc.nextFloat();
    	          d2=mysc.nextFloat();
    	          d3=mysc.nextFloat();
    	          BasicShape b=new BasicShape(name,d1,d2,d3);
    	          b.findArea(name,d1,d2,d3);
    	          b.findPerimeter(name,d1,d2,d3);
    	          log.info(are);
    	          ra=""+b.retArea();
    	          log.info(ra);
    	          rp=""+b.retPeri();
    	          log.info(per);
    	          log.info(rp);
    	          b=null;

    	      }
    	      else if((name.equals("circle"))||(name.equals("square")))
    	      {
    	    	  log.info(etd);
    	          d1=mysc.nextFloat();
    	          BasicShape b=new BasicShape(name,d1);
    	          b.findArea(name,d1);
    	          b.findPerimeter(name,d1);
    	          log.info(are);
    	          ra=""+b.retArea();
    	          log.info(ra);
    	          rp=""+b.retPeri();
    	          log.info(per);
    	          log.info(rp);
    	          b=null;
    	      }
    	      else
    	      {
    	    	  log.info("Enter correct shape\n");
    	      }  
      }
	  }
    	  	  
    	  catch(Exception e) {
    		  log.info("Enter the shape name correctly");
    	  }
     
      mysc.close();
  }

}


class BasicShape 
{
  String name;
  String sq="square";
  double d1;
  double d2;
  double d3;
  double area;
  double peri;


  BasicShape(String name,double d1)
  {
      this.name=name;
      this.d1=d1;
  }
  BasicShape(String name,double d1,double d2)
  {
      this.name=name;
      this.d1=d1;
      this.d2=d2;
  }
  BasicShape(String name,double d1,double d2,double d3)
  {
      this.name=name;
      this.d1=d1;
      this.d2=d2;
      this.d3=d3;
  }
  public void findArea(String name,double d1) {
      if(name.equals(sq))
      {
          area=d1*d1;
      }
      else{
          area=(22*d1*d1)/7;
      }
  }
  public void findArea(String name,double d1,double d2) {
      
          area=d1*d2;
  }
  public void findArea(String name,double d1,double d2,double d3) {
      
      
      area=0.5*d1*d2;
  }
  public void findPerimeter(String name,double d1) {
      if(name.equals(sq))
      {
          peri=4*d1;
      }
      else
      {
          peri=(22*d1*2)/7;
      }
  }
  public void findPerimeter(String name,double d1,double d2) {
      
      peri=2*(d1+d2);
  }
  public void findPerimeter(String name,double d1,double d2,double d3) {
     peri=d1+d2+d3;
  }
  public double retArea()
  {
      return this.area;
  }
  public double retPeri()
  {
      return this.peri;
  }
}



