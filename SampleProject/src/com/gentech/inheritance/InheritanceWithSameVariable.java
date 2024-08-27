package com.gentech.inheritance;
class COLLEGE
{
	String collegname;
	COLLEGE( String clgname)
	{
		collegname=clgname;
		
	}
	void display()
	{
		System.out.println("University:"+collegname);
	}
    
}
class Teacher extends COLLEGE{
	String collegname ;
    String teachername;
    Teacher(String clgname,String cname,String tname)
	{
		super(clgname);
		collegname=cname;
		teachername=tname;
	}
    
    void display()
    {
    	super.display();
    	System.out.println("Collegename: used to be "+collegname);
        System.out.println("Teacher used to be: "+teachername);

    }
}
class Student2 extends Teacher
{

    String collegename;
    String teachername;
    Student2(String clgname,String cname,String tname,String ncname,String ntname)
    {
    	super(clgname,cname,tname);
    	collegename=ncname;
    	teachername=ntname;
    }
    
    void display2()
    {
    	display();
        System.out.println("Collegename now :"+collegename);     
        System.out.println("Teacher now :"+teachername);
    }

}
public class  InheritanceWithSameVariable{
    public static void main(String[] args) {
        Student2 s = new Student2("VTU Belgam","PET","palnetra","PES","SanthoshBabu");
        s.display2();
        s.display();
    }
}



