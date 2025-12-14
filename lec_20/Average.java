//package lec_20;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of array");
        int n=sc.nextInt();
        System.out.println("enter a element of array");
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        
              sum=sum+arr[i];
        }
        

       int Average=sum/arr.length;
        
        System.out.println("Average = "+Average);
        sc.close();
    }
}
