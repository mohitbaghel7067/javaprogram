import java.util.Scanner;
class positive_negative {
    public static void main(String arg[]){
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value to check");
        x=sc.nextInt();
        if(x>0){
           System.out.println("number is positive"); 
        }
        else if(x<0){
            System.out.println("number is negitive");
        }
        else if (x==0) {
        System.out.println("number is zero");}
        sc.close();
    }
}

