
//import java.io.File;
import java.io.FileReader;
//import java.io.FileWriter;

public class readfile {
    public static void main(String[] args) {
      //createData();
      readfileData();
    //     try {
    //         File file=new File("home.html");
    //         if(file.createNewFile()){
    //             System.out.println("done"+file.getName());

    //          }else{
    //              System.out.println("already file create");
    //          }
    //     } catch (Exception e) {
    //         System.out.println(e);
    //     }
    // }
    //     static void createData(){
    //         try {
    //             FileWriter writer=new FileWriter("home.html");
    //             writer.write("hello new file data");
    //             writer.close();
    //         } catch (Exception e) {
    //         System.out.println(e);
    //         }
        
     }
    static void readfileData(){
        try {
            FileReader reader=new FileReader("home.html");
            int ch;
            while( (ch=reader.read())!=-1) {
               System.out.print((char)ch); 
            }
        } catch (Exception e) {
            
        }
    }
}//p

