import java.util.Scanner;
public class commanprifix {
   public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("enter a first string");
    String s1=sc.next();
    System.out.println("enter a second string");
    String s2=sc.next();
    System.out.println("enter a third string");
    String s3=sc.next();
    int length=Math.min(s1.length(),
    Math.min(s2.length(),s3.length()));
    for(int i=0;i<length;i++){
        if(s1.charAt(i)==s2.charAt(i)&&s2.charAt(i)==s3.charAt(i)){
            System.out.println("match at character = "+s1.charAt(i));
        }
        else{
            break;
        }

    }
    sc.close();
   } 
}
