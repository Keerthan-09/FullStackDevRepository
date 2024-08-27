package com.gentech.constructordemo;
class Invoice
{
	Invoice(int invoicenumber)
	{
		System.out.println(" Invoice InvoiceNumber : "+invoicenumber);
	}
	Invoice(String customername)
	{
		System.out.println(" Invoice CustomerName : "+customername);
	}
	Invoice(long phoneno)
	{
		System.out.println(" Invoice PhoneNo : "+phoneno);
	}
	Invoice(double amount)
	{
		System.out.println(" Invoice Amount : "+amount);
	}
	Invoice(boolean ispaid)
	{
		System.out.println(" Invoice IsPaid : "+ispaid);
	}
}

public class InvoiceConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice obj1 = new Invoice(1001);
		Invoice obj2 = new Invoice("Mohan");
		Invoice obj3 = new Invoice(6360666845L);
		Invoice obj4 = new Invoice(35686.78);
		Invoice obj5 = new Invoice(true);

	}

}
