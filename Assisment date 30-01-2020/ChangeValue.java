//java.lang.StringBuffer
class ChangeValue{

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Hello string");
		buffer.replace(0,buffer.length(),"new value");
		System.out.println(buffer);	
	}



}