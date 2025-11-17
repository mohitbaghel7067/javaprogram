package array;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        int n,i,evencount=0,oddcount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of array");
        n= sc.nextInt();
        int []a=new int[n];
        System.out.println("enter a element");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]%2==0){
                evencount=evencount+1;
            }
            else
            oddcount=oddcount+1;
        }
        System.out.println("maxecount"+evencount);
        System.out.println("maxocount"+oddcount);
    }
    
}
