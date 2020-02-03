import java.util.Scanner;
class ValidateName{
	public static void main(String[] args) {
		
	

		Scanner s=new Scanner(System.in);
		System.out.println("enter the first name");
		try{

		String n1=s.nextLine();
		if(n1.equals(""))
		{
			throw new ExceptionName();
		}
		System.out.println("enter the last name");
		String n2=s.nextLine();
		if(n2.equals(""))
		{
			throw new ExceptionName();
		}
	}
	catch(ExceptionName f)
	{
		f.name();
	}
}
}
class ExceptionName extends Exception {

	    void name()
	    {
	    	System.out.println("Enter the 1st or 2nd name");
	    }

}
