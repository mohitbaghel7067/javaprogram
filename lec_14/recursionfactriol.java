 import java.util.Scanner;
 public class recursionfactriol {
    public static int calculatefact(int n){
    
        if(n==1||n==0){          
            return 1; 
        }

        int fact1=calculatefact(n-1);
        int fact=n*fact1;
        return fact;
    
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number calculate factriol = ");
         int n=sc.nextInt();
        
      //int n= 5; 
      int ans=calculatefact(n) ;
      System.out.println("factriol of given number = "+ans);
      sc.close();
    }
}
