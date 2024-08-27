package com.gentech.noargs;
class Product
{
    String name;
    int cost;
    Product()
    {
        name="Kurthi";
		cost=1000;
		System.out.println("product name " +name);
		System.out.println("product cost " +cost);
		System.out.println("------------------------");
    }
    
}
class Sales
{
    String type;
    int id;
    Sales()
    {
    	type="online";
		id=9;
		System.out.println("bought in " +type);
		System.out.println("sale id " +id);
		System.out.println("------------------------");
    }
}
class Order
{
	String address;
	int id;
	Order()
	{
		id=101;
		address="Bangalore";
		System.out.println( "id of order " +id);
		System.out.println( "order address " +address);
		System.out.println("------------------------");
		  
	}
}
class Inventory
{
	int ratings;
	int percentagesale;
	Inventory()
	{
		ratings=3;
		percentagesale=60;
		System.out.println( "ratings to the product" +ratings);
		System.out.println( "sales percentage" + percentagesale);
		System.out.println("------------------------");
		  
	}
}


public class NoArgsMarketting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pro=new Product();
		Sales sales=new Sales();
		Order order=new Order();
		Inventory inv=new Inventory();

	}

}
