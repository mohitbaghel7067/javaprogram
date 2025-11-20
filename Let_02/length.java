package Let_02;
import java.util.Scanner;
public class length {
    public static void main(String[] args) {
        int length;
        Scanner sc=new Scanner(System.in);
        String str=new String ();
        System.out.println("enter a name");
         str=sc.next();
        
       System.out.println("the string is = "+str);
       System.out.println("the length of string = "+str.length());
}
}
