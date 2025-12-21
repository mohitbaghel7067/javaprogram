import java.util.Scanner;
public class stringcountword {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=new String();
    System.out.println("enter a string");
    str=sc.nextLine();
    str=str.trim();
    String[] words=str.split(" ");
    System.out.println(" total words present in string = "+words.length);
  }  
}
