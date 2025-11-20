package Let_01;
import java.util.Scanner;
public class natural_no_sum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("enter a value of n");
        n=sc.nextInt();
        int i;
        i=1;
        while(i<=n){
            sum=sum+i;
            i++;
            
            
        }
        System.out.println("sum of n number = "+sum);
        
        sc.close();
    }
    
}
