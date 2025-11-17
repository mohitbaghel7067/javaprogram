package array;
import java.util.Scanner;
public class frequenci {
    int a[]=new int[10];
    int key;
    void getdata(){
        Scanner sc=new Scanner (System.in);
        int i;
        for(i=0;i<10;i++){
        System.out.println("enter a arry of element");
        a[i]=sc.nextInt();
        }
        System.out.println("enter a number to search frequency");
        key=sc.nextInt();
    }
    void count(){
      int i,count=0;
      for(i=0;i<10;i++){
        if(a[i]==key){
           count =count+1;
        }
      }
      System.out.println("frequenci="+count);
    }   
}
class demo{
    public static void main(String[] args) {
        frequenci  f =new frequenci();
        f.getdata();
        f.count();

    }
}