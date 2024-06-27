import java.io.BufferedReader;
import java.io.*;
public class File {
    public static void main(String[] args) {
        try {
            FileReader file= new FileReader("/Java language/FileHandling/File.txt");
            BufferedReader br = new BufferedReader(file);
            String input ="";
            while (true) {
                input=br.readLine();
                if (input==null) {
                    break;
                }
                System.out.println(input);
                br.close();;
                file.close();
            }
            
        } catch (FileNotFoundException e) {
            e.getMessage();   
        }catch(IOException I){
            I.getMessage();
        }
    }
}
