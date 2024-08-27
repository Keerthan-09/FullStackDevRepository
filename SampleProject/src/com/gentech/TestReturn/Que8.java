package com.gentech.TestReturn;
class ByteArry
{
	 public int length;

	byte[] byteArray(byte k[]) {
		byte b[]=new byte[k.length];
		for(int i=0;i<b.length;i++)
		{
			b[i]=k[i];
		}
		return b;
		
	}
}
public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte p[]= {1,2,3};
		ByteArry b=new ByteArry();
		 byte arr[]=b.byteArray(p);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
