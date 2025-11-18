package string;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        String s=new String();
        Scanner sc=new Scanner(System.in);
        String s=new String();
        System.out.println("enter a string to check palindrome");
        s=sc.next();
        int i,j,flag;
        i=0;
        j=s.length()-1;
        flag=0;
        while(i<j&&flag=0){
        if(s.charAt(i)!=s.charAt(j))
        flag=1;
        
        i++;
        j--;}
        if(flag==0)
        System.out.println("string is palindrome ");
        else
        System.out.println("string is not palindrome ");


    }
    
}
