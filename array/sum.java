package array;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in) ; 
    
    int size,sum=0,i;
    System.out.println("enter a size");
    size=sc.nextInt();
    int a[]=new int[size];
    for(i=0;i<size;i++){
        System.out.println("enter a element");
        a[i]=sc.nextInt();

    }
    for(i=0;i<size;i++)
    sum=sum+a[i];
    System.out.println("sum="+sum);
}}
