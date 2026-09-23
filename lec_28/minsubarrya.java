import java.util.Scanner;
public class minsubarrya {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,8,3,6,4};
        int low=0;
        int high=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        int n=arr.length;
        int target=5;
        while (high<n) {
            sum=sum+arr[high];
            
            while(sum>=target){
               int length=high-low+1;
               res= Math.min(res,length);
               sum=sum-arr[low];
               low++;
            }
            high++;
            
        }
        System.out.println("min sub array lenght = " +res);
    }
}
