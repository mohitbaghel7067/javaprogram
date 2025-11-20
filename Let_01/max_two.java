package Let_01;
import java.util.Scanner;
public class max_two {
   public static void main(String args[]) {
    int a,b;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter a value of a");
    a=sc.nextInt();
    System.out.println("enter a value of b");
    b=sc.nextInt();
    if(a>b)
    {
        System.out.println("a is greter value");
    }
    else if(a<b){
        System.out.println(" b is greter value");

    }
    sc.close();


    
   } 
}
