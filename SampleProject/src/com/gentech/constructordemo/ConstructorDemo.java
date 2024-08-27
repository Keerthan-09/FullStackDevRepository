package com.gentech.constructordemo;

class Profile
{
	String email;
	String username;
	String password;
	int userid;
	String bio;
	long  pno;
	String address;
	boolean status;
	Profile(String name,String pass)
	{
		this.username=name;
		password=pass;
		System.out.println("Login credentials are:" +username +password);
		System.out.println("Username:" +username );
		System.out.println("password:" +password);
		
	}
	Profile(String name,int id)
	{
		username=name;
		userid=id;
		System.out.println("userid:" +userid);
	}
	
	Profile(int number,String add)
	{
		pno=number;
		address=add;
		System.out.println("phone number" +pno);
		System.out.println("address:" +add);
	}
	
	
	Profile(boolean stat)
	{
		status=stat;
		if(stat==true)System.out.println("status active");
		else System.out.println("status :offline" ); 
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profile p1=new Profile("keerthana","keerthanacm508@gmail.com");
		Profile p2=new Profile("keerthana",52);
		Profile p3=new Profile(866085377,"keerthanacm508@gmail.com");
		Profile p4=new Profile(true);

	}

}
