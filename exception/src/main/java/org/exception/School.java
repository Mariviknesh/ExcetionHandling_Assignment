package org.exception;

import java.util.Scanner;
import java.util.logging.*;
class School
{
    public static void main(String []args)
    {
        String name;
        String grade;
        double gpa;
        int ch=0;
        Scanner mysc=new Scanner(System.in);
        Logger log=Logger.getLogger("com.api.jar");
        try
        {
        	log.info("Enter the Student's name:");
            name=mysc.nextLine();
            log.info("Enter the Student's grade:");
            grade=mysc.next();
            log.info("Enter the Student's gpa:");
            gpa=mysc.nextDouble();
            Student s=new Student(name,grade,gpa);
            s.display();
            while(ch!=3)
            {
                log.info("\nMENU\n1.Update gpa");
                log.info("2.Display");
                log.info("3.Exit");
                log.info("Enter the choice:");
                ch=mysc.nextInt();
                switch(ch)
                {
                    case 1:
                    log.info("Enter the Student's gpa to get updated:");
                    double ugpa=mysc.nextDouble();
                    s.updateGpa(ugpa);
                    break;
                    case 2: s.display();
                    break;
                    default:
                    	log.info("Enter the correct choice");
                }
            }
        }
        catch(Exception e) {
        	log.info("Input Mismatched");
        }
        mysc.close();
    }
}
class Student{
    String name;
    String grade;
    double gpa;
    Logger log=Logger.getLogger("com.api.jar");
    Student(String name,String grade,double gpa)
    {
        this.name=name;
        this.grade=grade;
        this.gpa=gpa;
    }
    public void updateGpa(double upga)
    {
        gpa=upga;
       
    }
    public void display()
    {
        log.info("Student Name:");
        log.info(this.name);
        log.info("Student Grade:");
        log.info(this.grade);
        log.info("Student GPA:");
        String gp=""+this.gpa;
        log.info(gp);

    }
    
}