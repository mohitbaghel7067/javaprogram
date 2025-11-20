import java.util.Scanner;
public class primeclass {
    int n;
    void getdata(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a value to ckeck to prime number");
    n=sc.nextInt();
    }
void putdata(){
    int i,count=0;
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        count++;}
        if(count==2){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    

}
public static void main(String[] args) {
    primeclass aa=new primeclass();
    aa.getdata();
    aa.putdata();
}
    
}
