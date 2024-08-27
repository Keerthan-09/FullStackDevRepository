package com.gentech.outerinnerclass;
class Doctor
{
	static String dname;
	String wname;
	Doctor(String dn,String wn)
	{
		dname=dn;
		wname=wn;
		Patient p=new Patient("Deeraj",this);
		p.diagnose("migrane");
	}
	static class Patient
	{
		String pn;
		Doctor doc;
		
		Patient(String s,Doctor doctor)
		{
			this.pn=s;
			this.doc=doctor;
			
		}
		void diagnose(String problem)
		{
			System.out.println(Doctor.dname);
			System.out.println(doc.wname);
			
			System.out.println(problem);
			System.out.println(pn);
		
		}
	}
	
}

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d=new Doctor("Anish","Rudra");

	}

}
