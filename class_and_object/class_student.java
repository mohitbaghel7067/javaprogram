package class_and_object;
import java.util.Scanner;
public class class_student {
    int roll;
     String namestring;
    int marks;
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a roll no");
        roll=sc.nextInt();
        System.out.println("enter a  name");
        String namestring=sc.nextLine();
        System.out.println("enter a marks");
        marks=sc.nextInt();
    }
    void putData(){
      System.out.println("roll"+roll);
      System.out.println("stringname"+namestring);
      System.out.println("marks"+marks);

    }
    public static void main(String args[]){
      class_student aa=new class_student();
      aa.getData();
      aa.putData();


    }
}
