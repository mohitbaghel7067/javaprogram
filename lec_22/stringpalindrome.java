//package lec_22;
import java.util.Scanner;
public class stringpalindrome {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("enter a string ");
        str=sc.nextLine();
        boolean ispalindrome=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                ispalindrome=false;
                break;
            }
         }
         if(ispalindrome){
            System.out.println("string is plindrome = "+str);
         }
         else{
            System.out.println("string is no palindrome = "+str);
         }
         sc.close();
        }
    }
