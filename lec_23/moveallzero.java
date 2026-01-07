import java.util.*;
public class moveallzero {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,4,5,0};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
