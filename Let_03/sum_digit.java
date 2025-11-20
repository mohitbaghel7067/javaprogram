import java.util.Scanner;
public class sum_digit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("enter a value of n");
        n=sc.nextInt();
        while(n>0){
            int digit=n%10;
            sum +=digit;
           n =n/10;

        }
        System.out.println("sum = "+sum);
        sc.close();
    }
    
    
}
