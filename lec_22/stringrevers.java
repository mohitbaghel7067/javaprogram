//package lec_22;
import java.util.Scanner;
public class stringrevers {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=new String();
    System.out.println("enter a string ");
    str=sc.nextLine();
    for(int i=str.length()-1;i>=0;i--)
        System.out.print(str.charAt(i));
    
    sc.close();
   } 
   
}
