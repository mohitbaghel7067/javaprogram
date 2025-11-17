import java.util.Scanner;
public class sum_even_odd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n,sumEven=0,sumOdd=0;
        System.out.println("enter value of n");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sumEven+= i;
            
            
            }
            else {
                sumOdd+=i;
            
            }
            System.out.println("sum ="+sumEven);
            System.out.println("sum ="+sumOdd);
            

        }

        sc.close();
    }
}
