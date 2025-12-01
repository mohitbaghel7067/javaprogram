
import java.util.Scanner;
public class second_maxelement_array {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int  i,size;
    System.out.println("enter a size of array");
    size=sc.nextInt();
    int arr[]=new int[size];
     
     for(i=0;i<size;i++){
        System.out.println("enter a element of array");
     arr[i]=sc.nextInt();}
     int max=arr[0],secondmax=arr[1];
     for(i=1;i<size;i++){
        if(arr[i]>max){
         secondmax=max;
         max=arr[i];
     }
     
     else if(arr[i]<max&&arr[i]>secondmax){
        secondmax=arr[i];
     }
     }
     
     System.out.println("max second element = "+secondmax);
     sc.close();
   }
  }  

