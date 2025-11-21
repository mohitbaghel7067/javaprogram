//package Let_08;
import java.util.Scanner;
public class countword {
    public static void main(String[] args) {
        String s=new String();
        int i,count=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        s=sc.nextLine();
        for(i=0;i<s.length();i++){  
            if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
                count=count+1;

        }
        System.out.println("totel word = "+count);
    }
    
}
