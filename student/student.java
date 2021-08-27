package org.student;
import org.department.*;

public class student extends Department {
	public  void studentName()
	{
		 
		System.out.println("studentName  : Joy");
	
	}
	public  void studentDept()
	{
		 
		System.out.println("studentDept : CS");
	
	}
	public  void studentId()
	{
		 
		System.out.println("studentId : 255");
	
	}


public static void main(String[] args)

{
	student stu= new student();
	stu.collegeName();
	stu.collegeCode(101);
	stu.collegeRank();
	stu.deptName();
   stu.studentDept();
   stu.studentName();
   stu.studentId();
}


}