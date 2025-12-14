import java.util.Scanner;
public class onepluse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of array");
        int n=sc.nextInt() ;
        int arr[]=new int[n];
        System.out.println("enter a element of array"); 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}
            boolean carry=true;
            for(int i=n-1;i>=0;i--){
            if( arr[i]<9){
                arr[i]=arr[i]+1;
                carry=false;
                break;
            }else{
                arr[i] =0;
            }
        
        }
        if(carry){
            int newcarry[]= new int [n+1];
            newcarry[0]=1;
            for(int i=0;i<newcarry.length;i++)
                System.out.println(newcarry[i]+" ");

        }else{
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
        }
        sc.close();
     }
    
}
