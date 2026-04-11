public class array {
   public static void main(String[] args) {
    int arr[]={1,3,4,6,3,7,};
    for(int i=0;i<arr.length;i++){
        if(i%2==0){
            arr[i]=arr[i]*20;
        }
        else{
            arr[i]=arr[i]+10;
        }
    
    System.out.print(arr[i]+ " ");
    }
   } 
   
}
