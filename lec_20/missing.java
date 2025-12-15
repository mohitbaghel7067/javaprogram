public class missing {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,9};
        int n=arr.length+1;
        int totalsum=n*(n+1)/2;
           
         int sum=0;
        
        for(int i=0;i<arr.length;i++){
              sum+=arr[i];
        }
        int missing=totalsum-sum;
        
            System.out.println("missing number = "+missing);
    }
}
