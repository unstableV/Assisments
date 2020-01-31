class BinaryToDecimal {

    public static void main(String args[]){

       int num=Integer.parseInt(args[0]);

       int binary=0,i=1,remainder;

       while(num!=0)

       {

       	remainder=num%2;

       	num=num/2;

       	binary=binary+(remainder*i);

       	i=i*10;

       }

       System.out.println("Binary number is");

       System.out.println(binary);

     

    }

}