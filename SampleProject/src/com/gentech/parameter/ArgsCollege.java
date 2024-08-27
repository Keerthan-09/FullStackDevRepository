package com.gentech.parameter;
class Student
{
    String name;
    int id;
    Student(String sname,int sid)
    {
    	name=sname;
		id=sid;
		System.out.println("name:" +name);
		System.out.println("id:" +id  );
		System.out.println("------------------------");	
    }
    
}
class Lib
{
    String name;
    int id;
    Lib(String dname,int did)
    {
    	 name=dname;
		 id=did;
		 System.out.println("Library Name:" +name);
		 System.out.println("id:" +id   );
		 System.out.println("------------------------");
		 
		 	
    }
}
class Sports
{
	String name;
	int playerno;
	Sports(String spo,int noofply)
	{
	     name=spo;
		 playerno=noofply;
		 System.out.println("sports name:" +name  );
		 System.out.println("sports players number:" +playerno );
		 System.out.println("------------------------");
	}
}

class ComputerLab
{
	String name;
	int compno;
	ComputerLab(String cn,int no)
	{
		name=cn;
		 compno=no;
		 System.out.println("lab name:" +name  );
		 System.out.println("sports players number:" +compno );
		 System.out.println("------------------------");
	}
}


public class ArgsCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student("Radha",28);
		Lib lib=new  Lib("Department",2);
		Sports spo=new Sports("Kabbadi",7);
		ComputerLab com=new ComputerLab("Python",18);


	}

}
