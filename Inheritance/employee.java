package Inheritance;
import java.util.Scanner;
public class employee {
    void work(){
        Scanner sc= new Scanner(System.in);
        System.out.println("employee is working");
    }
    }
    class manager extends employee{
        void attendmeeting(){
            System.out.println("manager is addtenmeeting");
        }
    }
    public class main {
        public static void main(String[] args) {
        manager m = new manager();
        m.work();
        m.attendmeeting();


    }
}
