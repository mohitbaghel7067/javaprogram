
import java.util.Scanner;
public class countvowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("enter a string ");
        str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
                System.out.println("no of vowel = "+count);
            }
            
            if(ch==' '){
                System.out.println(" ");
            }
            
        }
        sc.close();
    }
}
