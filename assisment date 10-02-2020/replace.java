import java.io.*;
import java.util.*;
public class replace {
  
    public static void main(String[] args) throws java.lang.Exception {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter the strings");
         String STRING_A = s.nextLine();
         String STRING_B = s.nextLine();

        String originalFilePath = "count.txt";
        String originalFileContent = "";
        
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            
            reader = new BufferedReader(new FileReader(originalFilePath));
            
            String currentReadingLine = reader.readLine();
        
            while (currentReadingLine != null) {
                originalFileContent += currentReadingLine + System.lineSeparator();
                currentReadingLine = reader.readLine();
            }
            
            String modifiedFileContent = originalFileContent.replaceAll(STRING_A, STRING_B);
            
            writer = new BufferedWriter(new FileWriter(originalFilePath));
            
            writer.write(modifiedFileContent);
        } catch (IOException e) {
            
        } finally {
            
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
            }
        }
    }
}