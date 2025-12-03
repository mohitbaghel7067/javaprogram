import java.util.Scanner;
public class delete_element {
   public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int delete,flog=0,i;
   System.out.println("enter a size of array");
   int size=sc.nextInt();
   int arr[]=new int[size];
   for( i=0;i<size;i++){
    System.out.println("enter a element of array");
     arr[i]=sc.nextInt();
    
   }
   System.out.println("enter a element for delete");
   delete=sc.nextInt();
       System.out.println("original array");
   for(i=0;i<size;i++)
System.out.println(arr[i]);
for(i=0;i<size;i++){
    if(arr[i]==delete){
        flog=1;
        break;
    }
}
if(flog==0){
    System.out.println("element is not found");
}
else{
    for(;i<size-1;i++)
        arr[i]=arr[i+1];  
    System.out.println("modified array is  ");
    for(i=0;i<size-1;i++)
        System.out.println(arr[i]);
}
sc.close();
   }
    
   } 

