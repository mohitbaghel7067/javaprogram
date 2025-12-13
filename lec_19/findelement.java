import java.util.Scanner;
public class findelement {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a size array");
    int n=sc.nextInt();
    System.out.println("enter a element of array");
    
    int arr[]=new int [n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    
}
System.out.println("enter a element to find");
int data=sc.nextInt();
int index=-1;
for(int i=0;i<arr.length;i++){
    if(arr[i]==data){
        index=i;
        break;
    }
}
System.out.println("index of find array = "+index);
}
}
