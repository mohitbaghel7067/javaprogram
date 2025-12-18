import java.util.Arrays;
import java.util.Scanner;
public class majorityelement {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
      int arr[]={1,1,2,2,1,2,2};
       Arrays.sort(arr);
      for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+" ");
      }
       int mid=  arr.length/2;
       System.out.println("mid index"+mid);
       System.out.println("mid element"+arr[mid]);
      
      
      sc.close();
      
    }
}
