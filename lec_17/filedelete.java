//package lec_17;

import java.io.File;
//import java.io.FileWriter;

public class filedelete {
        public static void main(String[] args) {
            deleteFile();
      //createData();
    //     try {
    //         File file=new File("home.html");
    //         if(file.createNewFile()){
    //             System.out.println("done"+file.getName());

    //         }else{
    //             System.out.println("already file create");
    //         }
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
    static void deleteFile(){
        try {
            File file=new File("home.html");
            if(file.delete()){
                System.out.println("delete");
            }else{
                System.out.println("not delete");
            }

        } catch (Exception e) {
            
        }
    }
    
}//p




