import java.util.Scanner;
public class fabonacci {
    public static void main(String args[]){
        int x=0,y=1,z=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to find fabonacci");
        n=sc.nextInt();
        while( z<=n){
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
            
        
        
        
        }


    }
    
}

