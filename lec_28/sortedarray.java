public class sortedarray {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={2,4,6,8,9};
        int i=0;
        int j=0;
        int n=arr1.length;
        int m=arr2.length;
        int res[] =new int [m+n];
        int id=0;

        while(i <n && j <m){
            if(arr1[i] < arr2[j]){
                res[id]=arr1[i];
                id++;
                i++;
            }
            else{
               res[id]=arr2[j];
               id++;
               j++;
            }

        }
        while(i<n){
            res[id]=arr1[i];
            id++;
            i++;
        }
        while(j<m){
            res[id]=arr2[j];
            id++;
            j++;
        }
    
    System.out.println("sorted array");
    for(int k=0;k< res.length;k++){
        System.out.print(res[k]+" ");
    }
}
}
