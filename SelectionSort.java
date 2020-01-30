//Date-27-01-2020
import java.util.Scanner;
class SelectionSort
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []value = new int[10];
        int temp,min;
        System.out.println("please enter numbers");
        for(int i = 0;i < 5;i++)
        {
         value[i] = scan.nextInt();
        }
        for(int i = 0;i < 4;i++)
        {
            min = i;
            for(int j = i+1;j < 5;j++)
            {
                if(value[j] < value[min])
                {
                    min = j;
                }
                if(value[j]==value[min])
            {
                continue;
            }
                
            }

            temp = value[min];
                value[min] = value[i];
                value[i] = temp;
        }
        System.out.println("numbers in sorted order are");
        for(int i = 0;i  <5;i++)
        {
         System.out.println(value[i]);
        }
    }


}

 
