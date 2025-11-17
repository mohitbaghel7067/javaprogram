package class_and_object;
import java.util.Scanner;
public class rectangle {
    int length;
    int bregth;
    int area;
   int premeter;
   void getdata(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a length");
    length=sc.nextInt();
    System.out.println("enter a bregth");
    bregth=sc.nextInt();
   }
    void putdata(){
        area=length*bregth;
        premeter=2*(length+bregth);
        System.out.println("Area"+area);
        System.out.println("Premeter"+premeter);
    }

   public static void main(String[] args) {
    rectangle r=new rectangle();
    r.getdata();
    r.putdata();
   }
    
}
