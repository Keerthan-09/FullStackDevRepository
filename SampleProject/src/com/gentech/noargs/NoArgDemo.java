package com.gentech.noargs;

class Emp
{
    String name;
    int empage;
    int empid;
    Emp()
    {
    name="krishna";
    empage=18;
    empid=101;
    System.out.println("Profile of" + name);
    System.out.println("age " + empage);
    System.out.println("id " +empid);
    System.out.println("------------------------");
    }
}



class Insurance
{
    String insurancetype;
	int insuranceid;
	Insurance(){

	insurancetype="Medical";
   insuranceid=8;
    System.out.println("insurance "  +insurancetype);
    System.out.println("insuranceid " + insuranceid);
    System.out.println("------------------------");
	}
}


class Department
{
	int depid;
	String depname;
	Department(){
		depid=1;
        depname="Software Developer";
        System.out.println("depid " + depid);
        System.out.println("depname " +depname );
        System.out.println("------------------------");   
        
	}
}


public class NoArgDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp = new Emp();
        Insurance insu=new Insurance();
        Department dept=new Department();

	}

}
