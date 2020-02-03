import com.cg.eis.exception;
import java.util.Scanner;
class Salary1{
public static void main(String[] args) {
	

	Scanner s=new Scanner(System.in);
		System.out.println("enter your salary");
		try{

		int n1=s.nextInt();
		if(n1<=3000)
		{
			throw new ExceptionName();
		}
	}
	catch(ExceptionName f)
	{
		f.SalaryLow();
	}
}
}