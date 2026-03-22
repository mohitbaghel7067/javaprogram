package lec_07;
import java.util.Scanner;
public class employee {
    void work(){
        Scanner sc= new Scanner(System.in);
        System.out.println("employee is working");
        sc.close();
    }
    }
    class manager extends employee{
        void attendmeeting(){
            System.out.println("manager is addtenmeeting");
        }
    }
     class Main {
        public static void main(String[] args) {
        manager m = new manager();
        m.work();
        m.attendmeeting();


    }
}
