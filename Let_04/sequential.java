package Let_04;

import java.util.Scanner;
public class sequential {
   public static void main(String[] args) {
     Scanner sc=new Scanner (System.in) ; 
    
    int size,sum=0,i,key;
    System.out.println("enter a size");
    size=sc.nextInt();
    int a[]=new int[size];
    for(i=0;i<size;i++){
        System.out.println("enter a element");
        a[i]=sc.nextInt();
    }
        System.out.println("enter a secrch element");
        key=sc.nextInt();
        boolean found=false;
    for(i=0;i<size;i++){
        if(a[i]==key){
            found=true;
            break;
        }

        }
    if(found){
        System.out.println("number is found at index"+i);}

        else{
            System.out .println("number is not found");
        }
    }
}
    
 

            