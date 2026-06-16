//package lec_01;
import java.util.*;
public class twosum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int targat=7;
        int i=0;
        int j=arr.length-1;
        while (i<j) {
            int sum=arr[i]+arr[j];
            
            if(sum==targat){
                System.out.println(arr[i]+ " "+ arr[j]);
                return ;
            }
            else if(sum<targat)
            i++;
        else {
        j--;
        }
        }
        System.out.println("pair is not found");
    }
}
