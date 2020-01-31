import java.util.Scanner;
class PositiveString{

	public static void main(String[] args) {
		int flag=0;
		Scanner sc= new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String str= sc.nextLine();
        for(int i=0 ;i<str.length()-1;i++)
        {
		char character1 = str.charAt(i);
		char character2 = str.charAt(i+1); 
        int ascii1 = (int) character1;
        int ascii2 = (int) character2;
        if(ascii1<ascii2)
        {
        	flag=1;
        }
        else
        {
        	flag=0;
        	break;
        }
    }
    if(flag==1)
    {
    	System.out.println("POSITIVE");
    }
    else{
    	System.out.println("NEGATIVE");
    }
	}





}