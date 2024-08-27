package com.gentech.parameter;

class Emp
{
    String name;
    int empage;
    int empid;
    Emp(String n,int age,int id)
    {
    name=n;
    empage=age;
    empid=id;
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
	Insurance(String type,int id){

	insurancetype=type;
    insuranceid=id;
    System.out.println("insurance "  +insurancetype);
    System.out.println("insuranceid " + insuranceid);
    System.out.println("------------------------");
	}
}


class Department
{
	int depid;
	String depname;
	Department(int id,String name){
		depid=id;
        depname=name;
        System.out.println("depid " + depid);
        System.out.println("depname " +depname );
        System.out.println("------------------------");   
        
	}
}





public class ArgCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp = new Emp("Keerthana",22,52);
        Insurance insu=new Insurance("Accident",10);
        Department dept=new Department(1,"ECE");


	}

}
