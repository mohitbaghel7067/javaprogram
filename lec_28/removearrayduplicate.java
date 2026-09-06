//package lec_2
import java.util.Scanner;
public class removearrayduplicate {
    public static void main(String[] args) {
        
    
    int arr[]={1,1,1,2,2,3};
    int high=1;
    int low=0;
    int unique=1;
    while(high<arr.length){
      if(arr[high]==arr[high-1]){
        high++;
        continue;
      }
      arr[low+1]=arr[high];
      low++;
      unique++;
      high++;
    }

    System.out.println("unique element = " +unique);
    for (int i = 0; i < unique; i++) {
            System.out.print(arr[i] + " ");
        }
}
}