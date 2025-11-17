import java.util.Scanner;
public class x_power_y {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int power=1, x,y;
        System.out.println("enter a base");
        x=sc.nextInt();
        System.out.println("enter a power");
        y=sc.nextInt(); 
        while(y>0) {
            power=power*x;
            y--;
        }     
        System.out.println("power = "+power);


    }
    
}
