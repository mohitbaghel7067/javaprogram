
import java.util.Scanner;
public class even_odd_countarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size,evencount=0,oddcount=0;
        System.out.println("enter a size of array");
         size=sc.nextInt();
         int arr[]= new int [size];
         for(int i=0;i<size;i++){
            System.out.println("enter a element of array");
            arr[i]=sc.nextInt();
         }
         for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else
                oddcount++;
         }
           System.out.println("even no of count = "+evencount );
           System.out.println( "odd no of count = "+oddcount);
           sc.close();


        
    }
    
}
