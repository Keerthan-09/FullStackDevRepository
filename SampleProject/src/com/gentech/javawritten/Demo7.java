package com.gentech.javawritten;
class Animal
{
    {
        System.out.println("Animals are categorized into wild animals and Domestic animal");
	}
    static
	{
		System.out.println("Animals has great part on the world");
	}
}

class DomesticAnimlas extends Animal
{
	
	DomesticAnimlas(String k)
	{
		System.out.println("My favourite animal is:" +k);
	}
}
public class Demo7
{
    public static void main(String args[])
	{
		DomesticAnimlas s=new DomesticAnimlas("Cat");
	}
	
}

