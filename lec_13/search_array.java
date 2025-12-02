//package lec_13;
import java.util.Scanner;
public class search_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,target=0,size;
        System.out.println("enter a size of array");
        size=sc.nextInt();
        int arr[]=new int[size];
        for(i=0;i<size;i++){
            System.out.println("enter a element of array");
            arr[i]=sc.nextInt();}
        
        System.out.println("enter a value of target");
        target=sc.nextInt();
    
        for(i=0;i<size;i++){
            if(arr[i]==target)
                System.out.println("this is a value of target = "+target);
            
            

            
            }
  
        sc.close();

    }
    
}
