import java.util.Scanner;
class student{
    int roll;
    void getroll(int n){
        roll=n;
    }
    void putroll(){
        System.out.println("roll="+roll);
    }
}
class test extends student{
    float marks1,marks2;
    void getmarks(float m1,float m2){
        marks1 = m1;
        marks2 = m2;
    }
    void putmarks(){
        System.out.println("marks1 = "+marks1);
        System.out.println("marks2 ="+marks2);
    }
}
 interface sport{
    float sportmarks=60.2f;
    void putsport();

    
 }
 class result extends test implements sport{
    float total;
    public void putsport(){
        System.out .println("sportmarks ="+sportmarks);
    }

    
    void display(){
    total=marks1+marks2+sportmarks;
    putroll();
    putmarks();
    putsport();
    System.out.println("total marks ="+total);

    }
 }
 class Interface_student{
    public static void main(String[] args) {
        result aa=new result();
        aa.getroll(195);
        aa.getmarks(30.6f, 35.8f);
        aa.display();
    }
 }

