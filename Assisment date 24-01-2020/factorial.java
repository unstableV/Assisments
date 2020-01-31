class factorial{



public static void main(String[] args) {

	int num=Integer.parseInt(args[0]),num1=1;

	while(num>0)

	{

		num1=num1*(num);

		num--;

	}

	System.out.println("Factorial of given number is");

	System.out.println(num1);



}





}