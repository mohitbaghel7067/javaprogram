//package whileloop;
import java.util.Scanner;
public class revers {
    public static void main (String args[]){
    int n,revers=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a value of n");
    n= sc.nextInt();
    while(n>0){
     revers=(revers*10)+n%10;
     n=n/10;
    }
    System.out.println("revers = " +revers);
}

    
}
