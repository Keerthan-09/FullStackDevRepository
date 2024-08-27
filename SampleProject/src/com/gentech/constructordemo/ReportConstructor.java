package com.gentech.constructordemo;
import java.util.Date;

class ReportGeneration
{
	ReportGeneration(int id)
	{
		System.out.println("ID : " + id);
	}

	ReportGeneration(String title)
	{
		System.out.println("Report Title: " + title);
	}

	ReportGeneration(Date publishedDate)
	{
		System.out.println("Poject Published date:" + publishedDate);
	}

	ReportGeneration(byte pageCount)
	{
		System.out.println("No. of pages: " + pageCount);
	}

	ReportGeneration(boolean ispublished)
	{
		System.out.println("Is the Project is Published:" + ispublished);
	}

}




public class ReportConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReportGeneration r1=new ReportGeneration(28);
		ReportGeneration r2=new ReportGeneration("Auto Retarder Test Unit");
		ReportGeneration r3=new ReportGeneration("2024-04-19");
		ReportGeneration r4=new ReportGeneration(56);
		ReportGeneration r5=new ReportGeneration("true");
		
	}

}
