class MultiplicationTable{

	public static void main(String[] args) {

		int num1=Integer.parseInt(args[0]);

		int num2=Integer.parseInt(args[1]);

		for(int i=1;i<=num2;i++)

		{

			System.out.println(num1+"*"+i+"="+(num1*i));

		}

	}

}