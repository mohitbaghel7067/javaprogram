public class twosum {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,6,7};
    int targate= 8;
    boolean found=false;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
           if(arr[i]+arr[j]==targate){
            found =true;
            break;
           }
        
           
        }
        if(found) break;
    } if(found)
    System.out.println("targate is found");
           else
            System.out.println("targate is not found");
           
  }  
}
