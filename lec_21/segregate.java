import java.util.Arrays;

public class segregate {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,0,0,1};
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
        }
    }
}
