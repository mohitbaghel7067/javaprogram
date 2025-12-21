import java.util.Scanner;
public class stringremovevowel {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=new String();
    System.out.println("enter a string");
    str=sc.nextLine();
    String result=" ";
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(! (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
            result=result+ch;
        }
    }
    System.out.println("after removing vowel from string = "+result);
    sc.close();
   } 
}
