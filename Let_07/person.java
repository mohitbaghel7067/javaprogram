package Let_07;
import java.util.Scanner;
public class person {
    void displayname(){
        System.out.println("mohit baghel");
    }
}
class stutent extends person{
    void displayclasss(){
       System.out.println("Betch 2nd year");
    }
}
class monitor extends Student{
    void displaycheckdiscipline(){
        System.out.println("monitor is checking discipline");
    }
}
public class main{
    public static void main(String[] args) {
        monitor mon=new monitor();
        mon.displayname();
        mon.displayclass();
        mon.displaycheckdiscipline();
    }
}