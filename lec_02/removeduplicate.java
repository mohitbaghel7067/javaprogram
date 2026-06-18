// package lec_02;

public class removeduplicate {
public static void main(String[] args) {
  int arr[] ={1,1,1,2,2,3,4,4,5};
   int k=1;
   for(int i=0;i<arr.length;i++){
    if(arr[i]!=arr[k-1]){
        arr[k]=arr[i];
        k++;

    }
   }
   System.out.println(k);

}
}