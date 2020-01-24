class fibonaci{
    
    public static void main(String[] args) {
    	//int num=Integer.parseInt(args[0]);
    	int a=0,b=1,show=0,i=2;
    	    System.out.println("fibonaci series is:");
    	 while (i<100)
    {
    	if(show==89)
    	{
    		break;
    	}
        show=a+b;
        a=b;
        b=show;
        ++i;
        
        System.out.println(show);
        
    }
    }



}