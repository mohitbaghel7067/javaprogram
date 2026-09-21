import java.util.Arrays;
    public static void main(String[] args) {
        int arr[]={0,1,3,13,0,5,7,0};
        int left=0;
        int arr2[]=new int[arr.length];
        int right=arr.length-1;
        int j=0;
        while(left<=right){
        if(arr[left]!=0){

             arr2[j]=arr[left];
             j++;
        }
        
        left++;
    }
        while(j<arr2.length){
            arr2[j]=0;
            j++;
        }
    
        
        System.out.println("after move zero:"+ Arrays.toString(arr2));
        
    }

