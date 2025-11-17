import java.util.Scanner;
public class prime_no_check {
    public static void main(String[] args) {
        int n,count=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check prime");
        n=sc.nextInt();
         i=1;
        while(i<n){
            if(n%i==0){
            count++;
           
            
            i++;
        }
        if(count==2)
        System.out.println("number is primre");
        else
        System.out.println("number is not prime");
        
        }     
    
}
}
         
