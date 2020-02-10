import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class linenum {
 
    public static void main(String a[]){
        BufferedReader br = null;
        int i=1;
        String strLine = "";
        try {
            br = new BufferedReader( new FileReader("anotherFile.txt"));
            while( (strLine = br.readLine()) != null){
                System.out.println(i +" "+ strLine);
                i++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }
}