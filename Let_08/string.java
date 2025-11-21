//package Let_08;
import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        String str1=new String();
        String str2=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string first");
        str1=sc.nextLine();
        System.out.println("enter a second string");
        str2=sc.nextLine();
        if(str1.equals(str2))
       // if(str1.equalsIngnorecase(str2))
            System.out.println("string are equals");
        else
            System.out.println("string are not equals");
    }
    
}
