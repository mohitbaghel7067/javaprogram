import java.util.Scanner;
public class prime_n {
    public static void main(String[] args) {
        int j,i,count,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check prime");
        n=sc.nextInt();
         
         for(i=1;i<=n;i++){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0)
                count++;
            }
            if(count==2)
         
         System.out.println(i);
        }
        
}
}
         
