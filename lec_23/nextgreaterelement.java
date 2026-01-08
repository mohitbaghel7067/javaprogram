//package lec_23;
import java.util.Scanner;
public class nextgreaterelement {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={2,5,9,3,1,12,6,8,7};
    int arrb[]=new int[9];
    int greater =0;
    for(int i=0;i<arr.length;i++ ){
     if(arr[i]<greater){
        arrb[0]=greater;
     }
     System.out.println(+arr[i]);
    }
   } 
}
