package lec_11;
import java.util.Scanner;
public class max_array {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size;
    System.out.println("enter a size of array");
    size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
        System.out.println("enter a element of array");
        arr[i]=sc.nextInt();
        sc.close(); 
    }
    int max=arr[0];
    for(int i=1;i<size;i++){
        if(arr[i]>max)
            max=arr[i];
        
    
        }
        System.out.println("max element of array = "+max);
    }


  }  

