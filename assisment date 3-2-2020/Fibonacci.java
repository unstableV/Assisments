import java.util.Scanner;
class Fibonacci
{
public static void main(String[] input)
{
int x,y;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=s.nextInt();
int z[]=new int[n];
z[0]=1;
z[1]=1;
for(int i=2;i<n;i++){
z[i]=z[i-1]+z[i-2];
}
System.out.println("Fibonaciiries");
for(int i=0;i<n;i++)
{
System.out.println(z[i]);
}
}
}
