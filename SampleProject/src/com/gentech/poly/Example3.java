package com.gentech.poly;
class Action
{
	void tap()
	{
		System.out.println("stop");
	}
}
class Music extends Action
{
	void tap()
	{
		System.out.println("stops the music");
	}
}

class Video extends Action
{
	void tap()
	{
		System.out.println("Play the video");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action a=new Music();
		a.tap();
		
		Action k=new Video();
		k.tap();
		

	}

}
