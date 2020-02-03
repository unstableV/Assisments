import java.util.Scanner;
class PrimeNumber{

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i = 1; i<number; i++)
		{
			int c = 0;
			int flag = 0 ;
			for(int j = 1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
				if(c>2)
				{
					flag = 1;
					//System.out.println(i);
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
	}


}