package lec_07;
import java.util.Scanner;
 class person {
    void displayname(){
        System.out.println("mohit baghel");
    }
}
class Student extends person{
    void displayclass(){
       System.out.println("Betch 2nd year");
    }
}
class monitor extends Student{
    void displaycheckdiscipline(){
        System.out.println("monitor is checking discipline");
    }
}
public class Main{
    public static void main(String[] args) {
        monitor mon=new monitor();
        mon.displayname();
        mon.displayclass();
        mon.displaycheckdiscipline();
    }
}