public class searchelement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int targat=6;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==targat){
                System.out.println("targatfound");
                found =true;
            break;
            }
            if(found) break;
    } if(found)
    System.out.println("targate is found");
           else
            System.out.println("targate is not found");
        
        
    }
}
