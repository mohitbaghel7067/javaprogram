import java.util.Scanner;
public class remove_duplicate {
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int i,size,j;
   System.out. println("enter a size of array");
   size=sc.nextInt();
    int arr[]=new int [size];
    for(i=0;i<size;i++){
        System.out.println("enter a element of array");
        arr[i]=sc.nextInt();
    }
    System.out.println("array after removing  duplicate element = ");
    for(i=0;i<size;i++){
        boolean isduplicate=false;
        for(j=0;j<i;j++){
        if( arr[i]==arr[j]){
            isduplicate=true;
            break;
        }
    }
    if(!isduplicate){
        System.out.println(arr[i]);
    }
        
    }

    sc.close();
    

 }   
}
