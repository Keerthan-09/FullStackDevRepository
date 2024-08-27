package com.gentech.selflearning;
import java.util.Scanner;

public class CompareTocheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		Scanner scan=new Scanner(System.in);
		s1=scan.next();
		s2=scan.next();
		int res;
		System.out.println(s1);
		System.out.println(s2);

		res=s1.compareTo(s2);
		if(res==0) System.out.println(res);
		else if(res<1) System.out.println(res);
		else System.out.println(res);
		
			

	}

}
