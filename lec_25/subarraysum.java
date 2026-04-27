import.java.util.*
 
public class subarraysum {
    static int total =0;
    static void subarraysum(int[]arr,int i,int sum){
        if(i==arr.length){
            total += sum;
            return;
        }
        subarraysum(arr,i+1,sum+arr[i]);
        subarraysum(arr,i+1,sum);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int i=0;
        int sum =0;
        subarraysum(arr,i,sum);

    
    }
}
