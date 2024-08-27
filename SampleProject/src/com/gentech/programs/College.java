package com.gentech.programs;
class Student
{
    String name;
    int id;
    
}
class Lib
{
    String name;
    int id;
}
class Sports
{
	String name;
	int playerno;
}

class ComputerLab
{
	String name;
	int compno;
}
public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.name="Krishna";
		stu.id=52;
		System.out.println("name:" +stu.name);
		System.out.println("id:" +stu.id  );
		System.out.println("------------------------");
		
		
		 Lib lib=new  Lib();
		 lib.name="MainLib";
		 lib.id=18;
		 System.out.println("Library Name:" +lib.name);
		 System.out.println("id:" +lib.id   );
		 System.out.println("------------------------");
		 
		 
		 Sports spo=new Sports();
		 spo.name="Runningrace";
		 spo.playerno=1;
		 System.out.println("sports name:" +spo.name  );
		 System.out.println("sports players number:" +spo.playerno );
		 System.out.println("------------------------");
		 
		 
		 ComputerLab com=new ComputerLab();
		 com.name="JavaLab";
		 com.compno=50;
		 System.out.println("lab name:" +com.name  );
		 System.out.println("sports players number:" +com.compno );
		 System.out.println("------------------------");
	}

}
