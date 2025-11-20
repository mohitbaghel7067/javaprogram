import java.util.Scanner;
public class palindrome {
   public static void main(String[] args) {
    int n, original,revers=0;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter a number ");
    n=sc.nextInt();
    original=n;
    while( n>0){
        revers=(revers*10)+(n%10);
        n=n/10;
    }
       
        if(original==revers){
            System.out.println(" number is a palindrome ");

        }
        else
        System.out.println(" number is not palindrome ");
    
      sc.close();
   }
}
