package com.gentech.stringassignments;
class Pattern2 {
	static void pattern2(String s) {
		for (int k = 0; k < s.length(); k++) {
			for (int j = 0; j <= k; j++) {
				System.out.print(s.charAt(j)+ " ");
			}
			System.out.println();
		}
		for (int k = s.length()-1; k >= 0; k--) {
			for (int j = 0; j < k; j++) {
				System.out.print(s.charAt(j) +" ");
			}
			System.out.println();
		}
	}

}
public class StringAssign8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern2.pattern2("Program");

	}

}
