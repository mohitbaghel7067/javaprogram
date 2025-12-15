public class arrayintersection {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={1,2,5,7,8,9};
        int arr3[]=new int [Math.min(arr1.length,arr2.length)];
        int k=0;
        for(int i=0;i<arr1.length;i++){
        for( int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
                arr3[k]=arr1[i];
                k++;
                break;
            }
        }
        }
        for(int i=0;i<k;i++)
System.out.println(arr3[i]);
        
    }
}
