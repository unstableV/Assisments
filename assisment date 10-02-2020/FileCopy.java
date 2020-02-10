import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
class FileCopy extends Thread{
    public static void main(String[] args) {
        FileCopy thread = new FileCopy();
        thread.run();
    }
 
    @Override
    public void run(){
    	int characterCount = 0;
        try{
            FileReader fr = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("output.txt", true);
			String s;
 
			while ((s = br.readLine()) != null) { 
				fw.write(s); 

				if(!(s.equals(""))) 
               {
     
                characterCount += s.length();
               }
               System.out.println(characterCount);
				if(characterCount>=10)
				{
					System.out.println("file copied 10 characters");
        			Thread.sleep(5000);
				}
				fw.flush();
			}
			br.close();
			fw.close();
    }catch(InterruptedException ie){
        System.out.println("Someone just interrupted me :(");
    }
    catch(IOException i1)
    {
    	System.out.println("Someone just interrupted me :(");
    }
    }

}