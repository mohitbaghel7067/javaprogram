package array;
import java.util.Scanner;
public class max {
    public static void main(String[] args)
     { 
    int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a size of array");
    n=sc.nextInt();
    int []a= new int [n];
    System.out.println("enter a element");
    
for(i=0;i<n;i++)
{
    a[i]=sc.nextInt();
}
int max=a[0];
for(i=0;i<n;i++){
    if(max<a[0])
    max=a[i];
}
System.out.println("max element"+max);
    }
    
}
