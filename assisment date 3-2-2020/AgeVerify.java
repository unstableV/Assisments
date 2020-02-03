import java.util.Scanner;
class AgeVerify{
	public static void main(String[] args) {
		
	

		Scanner s=new Scanner(System.in);
		System.out.println("enter your age");
		try{

		int n1=s.nextInt();
		if(n1<=15)
		{
			throw new ExceptionName();
		}
	}
	catch(ExceptionName f)
	{
		f.age();
	}
}
}
class ExceptionName extends Exception {

	    void age()
	    {
	    	System.out.println("Age should be greater than 15");
	    }

}
