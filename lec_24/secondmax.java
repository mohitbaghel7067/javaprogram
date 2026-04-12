public class secondmax {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,8,10};
        int max=arr[0];
        int smax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max ){
                smax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
        
    
    

    }
}
