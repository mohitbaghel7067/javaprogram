import java.util.Scanner;
public class add_class {
int a,b;
void getdata()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first value");
    a=sc.nextInt();
    System.out.println("enter a second value");
    b=sc.nextInt();

}
void putdata(){
    System.out.println("addition = "+(a+b));
}

 

public static void main(String[] args){
    add_class aa = new add_class();
    aa.getdata();
    aa.putdata();
}
}