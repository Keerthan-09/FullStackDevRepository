package com.gentech.constructordemo;

class Contract
{
	Contract(int id)
	{
		System.out.println("Contract ID:" + id);
	}

	Contract(String name)
	{
		System.out.println("Person name:" + name);
	}

	Contract(byte duration)
	{
		System.out.println("Contract Duration interms of years:" + duration);
	}

	Contract(long dealcost)
	{
		System.out.println("Cost of the Deal:" + dealcost);
	}
}


public class ContractConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contract c1 = new Contract(28);
		Contract c2 = new Contract("Krishna");
		Contract c3 = new Contract(3);
		Contract c4 = new Contract(356000);

	}

}
