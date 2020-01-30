class Pallindron
{

	public static void main(String[] args) {
		String s;
		Scanner sc= new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String str= sc.nextLine();
        StringBuilder str1 = new StringBuilder(str);
        System.out.println(str1.reverse().toString());
        if(comapreTo(str1,str)==1)
        {
        	System.out.println("String is palendron");
        }
        else
        {
        	System.out.println("sTRING IS NOT PALLENDRON");
        }
	}



}