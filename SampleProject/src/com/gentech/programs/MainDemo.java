package com.gentech.programs;

class Emp
{
    String name;
    int empage;
    int empid;
}
class Insurance
{
    String insurancetype;
	int insuranceid;
}
class Department
{
	int depid;
	String depname;
}

public class MainDemo {

	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.name="krishna";
        emp.empage=18;
        emp.empid=101;
        System.out.println("Profile of" + emp.name);
        System.out.println("age " + emp.empage);
        System.out.println("id " + emp.empid);
        System.out.println("------------------------");
		
        Insurance insu=new Insurance();
        insu.insurancetype="Medical";
        insu.insuranceid=8;
        System.out.println("insurance "  +insu.insurancetype);
        System.out.println("insuranceid " + insu.insuranceid);
        System.out.println("------------------------");
        
        Department dept=new Department();
        dept.depid=1;
        dept.depname="Software Developer";
        System.out.println("depid " + dept.depid);
        System.out.println("depname " +dept.depname );
        System.out.println("------------------------");   
        
	}

}
