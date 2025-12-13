import java.util.Scanner;

public class bar {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a size array");
    int n=sc.nextInt();
    System.out.println("enter a element of array");
    int arr[]=new int [n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    } 
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    for(int floor=max;floor>=1;floor--){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=floor){
                System.out.print("*3
                1
                21\t");

            }
            else{
                System.out.print("\t ");
              }  }
    
    System.out.println();
            }
    sc.close();
}
}
