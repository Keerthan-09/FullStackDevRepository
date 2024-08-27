package com.gentech.files;
import java.io.File;
import java.io.IOException;

public class FileDemo1{

	public static void main(String[] args) {
	createFile("C:\\Users\\keert\\OneDrive\\Desktop\\FilesDemo\\ABC.html");
	
	//	renameFile();
	//	deleteFile();
	//fileCollections();
	}
		
	private static void createFile(String s)
	{
		try
		{
			File f1=new File("C:\\Users\\keert\\OneDrive\\Desktop\\FilesDemo\\ABC.txt");
			boolean v1=f1.createNewFile();
			System.out.println("has File created ?:"+v1);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void renameFile()
	{
		File f1=new File("C:\\Users\\keert\\OneDrive\\Desktop\\FilesDemo\\EDF.txt");
		File f2=new File("C:\\Users\\keert\\OneDrive\\Desktop\\FilesDemo");
		boolean v1=f1.renameTo(f2);
		System.out.println("Has it renamed ?:"+v1);
	}

	private static void deleteFile()
	{
		File f2=new File("C:\\Users\\keert\\OneDrive\\Desktop\\FilesDemo");
		boolean v1=f2.delete();
		System.out.println("Has it deleted ?:"+v1);
	}
	
	private static void fileCollections()
	{
		File f1=new File("C:\\Users\\keert\\OneDrive\\Desktop\\FilesDemo");
		File f[]=f1.listFiles();
		for(int i=0;i<f.length;i++)
		{
			if(f[i].isFile()==true)
			{
				String path=f[i].getAbsolutePath();
				System.out.println(path);
			}
		}
	}
}



