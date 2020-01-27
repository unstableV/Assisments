import java.util.Scanner;
class FindNumber{

	public static void main(String[] args) {
		int flag=0;
		int []value = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter numbers");
		for(int i = 0;i < 10;i++)
		{
	     value[i] = scan.nextInt();
	    }
	    System.out.println("Enter the number to search");
	    int search = scan.nextInt();
	    for(int i = 0;i < 10;i++)
	    {
	    	if(search == value[i])
	    	{
	    		System.out.println("Number found");

	    		flag = 1;
	    		break;
	    	}
	    }
	    if(flag == 0)
	    {
	    	System.out.println("Number not found");
	    }
}



}