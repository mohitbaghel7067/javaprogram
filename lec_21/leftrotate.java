
import java.util.Arrays;
import java.util.Scanner;
public class leftrotate {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
      int arr[]={1,2,3,4,5,6,7};
       Arrays.sort(arr);
      for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+" ");
      }
      int temp=arr[0];
      for(int i=0;i<arr.length-1;i++){
       arr[i]=arr[i+1];
      }
      arr[arr.length-1]=temp;
      System.out.println("rotate"+Arrays.toString(arr));
    }
}

