package com.gentech.noargs;

class Student
{
    String name;
    int id;
    Student()
    {
    	name="Krishna";
		id=52;
		System.out.println("name:" +name);
		System.out.println("id:" +id  );
		System.out.println("------------------------");	
    }
    
}
class Lib
{
    String name;
    int id;
    Lib()
    {
    	 name="MainLib";
		 id=18;
		 System.out.println("Library Name:" +name);
		 System.out.println("id:" +id   );
		 System.out.println("------------------------");
		 
		 	
    }
}
class Sports
{
	String name;
	int playerno;
	Sports()
	{
	     name="Runningrace";
		 playerno=1;
		 System.out.println("sports name:" +name  );
		 System.out.println("sports players number:" +playerno );
		 System.out.println("------------------------");
	}
}

class ComputerLab
{
	String name;
	int compno;
	ComputerLab()
	{
		name="JavaLab";
		 compno=50;
		 System.out.println("lab name:" +name  );
		 System.out.println("sports players number:" +compno );
		 System.out.println("------------------------");
	}
}

public class NoArgsCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		Lib lib=new  Lib();
		Sports spo=new Sports();
		ComputerLab com=new ComputerLab();

	}

}
