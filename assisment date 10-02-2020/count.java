import java.io.*;
class count {
public static void main(String [] args) {
char[] in = new char[100]; // to store input
int size = 0;
int u=0;
int count = 1;
try{
File file = new File("question2File.txt"); //Again this is just an object
 
FileWriter fw = new FileWriter(file); // create an actual file
// & a FileWriter obj
fw.write("Hello\nguys\nhow\nare\nyou\ndoing\nwe\nare\nalmost\ndone\nwith\ncore"); // write characters to
// the file
fw.flush(); // flush before closing
fw.close(); // close file when done
 
 
FileReader fr =
new FileReader(file); // create a FileReader
// object
size = fr.read(in); // read the whole file!
System.out.println("Total no of characters");
System.out.println(size + " "); // how many bytes read
for(char c : in){ // print the array
if(c=='\n')
{
	u++;
}
System.out.print(c);
}
//System.out.println("/n");
System.out.println("Total no of words");
System.out.println(u);
fr.close(); // again, always close
  //catch(IOException e) {System.out.println("Some issues reading from the file" + e.getMessage()); }
 

 
 
 
// StringBuilder sb = new StringBuilder("");
 File file1 = new File("count.txt"); //Again this is just an object
 BufferedReader br = new BufferedReader(new FileReader(file1));
 String str = "";
 while((str = br.readLine()) != null)
  {
//     sb.append(str + "\n");
     System.out.println(str);
   str = br.readLine();
   count++;
   System.out.println(str);
   }
   System.out.println(count);
  br.close();
   fr.close();
}
// System.out.println("Contents from file are : " + sb);
    catch(IOException e) {System.out.println("Can't read from the file currently..."); }
 }
}