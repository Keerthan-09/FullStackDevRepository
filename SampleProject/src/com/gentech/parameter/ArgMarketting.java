package com.gentech.parameter;

class Product
{
    String name;
    int cost;
    Product(String n,int c)
    {
        name=n;
		cost=c;
		System.out.println("product name " +name);
		System.out.println("product cost " +cost);
		System.out.println("------------------------");
    }
    
}
class Sales
{
    String type;
    int id;
    Sales(String salestype,int salesid)
    {
    	type=salestype;
		id=salesid;
		System.out.println("bought in " +type);
		System.out.println("sale id " +id);
		System.out.println("------------------------");
    }
}
class Order
{
	String address;
	int id;
	Order(String add,int orderid)
	{
		id=orderid;
		address=add;
		System.out.println( "id of order " +id);
		System.out.println( "order address " +address);
		System.out.println("------------------------");
		  
	}
}
class Inventory
{
	int ratings;
	int percentagesale;
	Inventory(int rate,int salepercent)
	{
		ratings=rate;
		percentagesale=salepercent;
		System.out.println( "ratings to the product" +ratings);
		System.out.println( "sales percentage" + percentagesale);
		System.out.println("------------------------");
		  
	}
}


public class ArgMarketting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pro=new Product("Baggy Jeans",1000);
		Sales sales=new Sales("online",101);
		Order order=new Order("bangalore near Ashraya PG",571432);
		Inventory inv=new Inventory(5,90);
	}

}
