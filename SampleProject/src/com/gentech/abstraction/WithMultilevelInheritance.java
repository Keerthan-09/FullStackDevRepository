package com.gentech.abstraction;

abstract class Bank{
    abstract void bankdetails(String Customer,int AccNo);
    void rules()
    {
        
        System.out.println("Bank details:");
        System.out.println("Minimum balance 300rs");
        System.out.println("Loan upto 30000");
        System.out.println("--------------");

    }
}
class Branch1 extends Bank{
    void bankdetails(String Customer, int AccNo) {
        super.rules();
        System.out.println("Customer name :"+ Customer);
        System.out.println("Account no: "+AccNo);
    }
}
class Branch2 extends Branch1{
    void display(String cname,int no)
    {
        super.bankdetails(cname,no);
    }
}
public class WithMultilevelInheritance
{
    public static void main(String[] args) {
        Branch2 o = new Branch2();
        o.display("SBI",3456);
        Bank o2= new Branch2();
        o2.rules();
        o2.bankdetails("Usha",4532);
    }
}

