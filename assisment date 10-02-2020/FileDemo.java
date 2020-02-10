import java.util.Scanner;
import java.io.File;
class FileDemo
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		File f1=new File(s);	
		System.out.println("File Name:"+f1.getName());
		System.out.println("Path:"+f1.getPath());
		System.out.println("This file is:"+(f1.exists()?"Exists":"Does not exists"));
		System.out.println("Is file:"+f1.isFile());
		System.out.println("Is Readable:"+f1.canRead());
		System.out.println("IS Writable:"+f1.canWrite());
		System.out.println("File Size:"+f1.length()+"bytes");
	}
}