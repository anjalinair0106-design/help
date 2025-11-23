import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class ReadWriteFile{
public static void main(String[]args){
try{
FileWriter w=new FileWriter("sample3.txt");
w.write("i am Anjali");
w.write("i am practicing for lab exams");
w.close();
System.out.println("successfully written");}
catch(IOException e){
System.out.println("error occurred");
e.printStackTrace();
}
try{
FileReader r= new FileReader("sample3.txt");
int ch;
System.out.println("reading the file content");
while((ch=r.read())!= -1){
System.out.println((char)ch);
}
r.close();
}
catch(IOException e){
System.out.println("error occurred");
e.printStackTrace();
}
}}
