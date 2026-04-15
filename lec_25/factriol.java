import java.util.Scanner;

public class factriol {
   static int factriol(int n) {
    if(n==0||n==1)
        return 1;
    int ans=n*factriol(n-1);
    return ans;

    
    
  } 

  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a element");
        int n=sc.nextInt();
        int result= factriol(n);
        System.out.println("factriol = "+result);
    
  } 
}
