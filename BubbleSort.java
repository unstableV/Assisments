//Date 27-01-2020
import java.util.Scanner;
class BubbleSort{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []value = new int[10];
		int temp;
		System.out.println("please enter numbers");
		for(int i = 0;i<5;i++)
		{
	     value[i] = scan.nextInt();
	    }
	    for(int i = 0;i < 4;i++)
	    {
	    	for(int j = i+1;j < 4;j++)
	    	{

	    		if(value[j]>value[j+1])
	    		{
	    			temp = value[i];
	    			value[i] = value[j];
	    			value[j] = temp;

	    		}
	    	}
	    }
	    System.out.println("numbers in sorted order are");
	    for(int i = 0;i < 5;i++)
		{
	     System.out.println(value[i]);
	    }
	}
}
