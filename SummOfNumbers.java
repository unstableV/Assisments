class SummOfNumbers{
	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		int flag=1;

			if(num1<40)
			{
				flag=0;

			}
			if(num2<40)
			{
				flag=0;
			}
			if(num3<40)
			{
				flag=0;
			}
			if(num1+num2+num3<125)
			{
				flag=0;
			}
			if(flag==1)
			{
				System.out.println("PASSING");
			}
			if(flag==0)
			{
				System.out.println("FAILING");
			}




		
	}
}