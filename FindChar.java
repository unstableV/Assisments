import java.util.Scanner;
class FindChar
{

		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String str= sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        for(int i=0 ; i<str.length() ; i++)
        {
        	if(ch == str.charAt(i))
        	{
        		System.out.println("Character found at " + i);
        	}

        }

		}



}