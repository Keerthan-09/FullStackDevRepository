package com.gentech.DBOperation;
import java.lang.reflect.Method;

public class DBFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj =new Sample();
		try {
			Method method[]=obj.getClass().getDeclaredMethods();
			for(int i=0;i<method.length;i++)
			{
				String s=method[i].getName();
				System.out.println(s);
				method[i].invoke(obj);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
