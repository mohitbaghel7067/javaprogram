 import java.util.*;
public class print5to1 {
    public static void printnumber(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printnumber(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        printnumber(n);
    }
}
