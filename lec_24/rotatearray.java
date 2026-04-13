public class rotatearray {
  public static void main(String[] args) {
    int arr[]={1,2,3,6,7,8};
    int d=2;
    rotatearr(arr,d);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    
  }  
  static void rotatearr(int arr[],int d){
    int n=arr.length;
    d= d % n;

    revers(arr,0,d-1);
    revers(arr,d,n-1);
    revers(arr,0,n-1);
    

  }
  static void revers(int []arr,int i,int j){
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;

    }
    
  }
}
