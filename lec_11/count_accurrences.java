package lec_11;
import java.util.Scanner;
public class count_accurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter a size of arr");
        size=sc.nextInt();
        int arr[]=new int[size];
        for( int i=0;i<size;i++){
            System.out.println("enter a element of arry");
            arr[i]=sc.nextInt();
        
        }
        int freq[]=new int[size];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(i+"occurs"+freq[i]+"time");
                sc.close();
            }
        }
    }
    
}
