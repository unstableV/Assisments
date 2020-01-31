import java.util.Scanner;
class SplitFun{

		public static void main(String[] args) {
		int temp=0;
		Scanner sc= new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String s1= sc.nextLine();
        StringBuilder str1 = new StringBuilder(s1);
        System.out.println("Enter the delimiter");
        String s2 =sc.nextLine();
        StringBuilder str2 = new StringBuilder(s2);


        for(int i=0 ; i< str1.length() ; i++)
        {
        	if(Character.toString(str1.charAt(i)).equals(Character.toString(str2.charAt(0))))
        		{
        			
        			System.out.println(str1.substring(temp,i));
        			
        			temp = i+1;
        			//System.out.println(temp);
        			if(temp+1==str1.length())
        			{
        				System.out.println(Character.toString(str1.charAt(str1.length()-1)));
        			}
        		}
        		if(i==str1.length()-1)
        		{
        		System.out.println(str1.substring(temp,i+1));	
        		}

		}

}
}