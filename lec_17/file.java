
import java.io.*;
public class file {
    public static void main(String[] args) {
        try {
            File file=new File("home.html");
            if(file.createNewFile()){
                System.out.println("done"+file.getName());

            }else{
                System.out.println("already file create");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
