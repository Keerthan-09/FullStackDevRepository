package com.gentech.selflearning;
class fib
{
	int a=1;
	int b=1;
	int c=10;
	static int[] fibser(fib f)
	{
		int fn=1;
		int sn=1;
		int n=0;
		int ser[] = new int[f.c];
		ser[0]=f.a;
		ser[1]=f.b;
		int sum=f.a+f.b;
		for(int i=2;i<f.c;i++)
		{
			n=fn+sn;
			ser[i]=n;
			sum+=ser[i];
			fn=sn;
			sn=n;
		}
		System.out.println(sum);
		return ser;
	}
}
public class Fiboncci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib f=new fib();
		
     int k[]=fib.fibser(f);
     for(int i=0;i<k.length;i++) {
     System.out.println(k[i]);
     }
	}

}
