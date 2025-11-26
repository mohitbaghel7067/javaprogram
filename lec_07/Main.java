package lec_07;
//package Let_07;
import java.util.Scanner;
 class Device {
    void poweron(){
        System.out.println("device is power on");
    }
}
class Laptop extends Device{
    void boot(){
       System.out.println("laptop is booting");
    }
}
class Gaminglaptop extends Laptop{
    void startgame(){
        System.out.println("game is stating on gaming laptop");
    }
}
public class Main{
    public static void main(String[] args) {
        Gaminglaptop g=new Gaminglaptop();
        g.poweron();
        g.boot();
        g.startgame();
    }
}