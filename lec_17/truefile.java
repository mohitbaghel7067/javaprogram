//package lec_17;

import java.io.File;
import java.io.FileWriter;

public class truefile {
    public static void main(String[] args) {
      createData();
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
        static void createData(){
            try {
                FileWriter writer=new FileWriter("home.html",true);
                writer.write(" jai shree krishna");
                writer.write(" ram ram ");
                writer.close();
            } catch (Exception e) {
            System.out.println(e);
            }
        
    }
    
}//p




