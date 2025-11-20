import java.util.Scanner;
public class reversclass {
    int n;
    void getdata(int i){
        n=i;
    }
    void putdata(){
        int revers=0;
        while(n>0){
            revers=(revers*10)+(n%10);
            n=n/10;
        }
        System.out.println("revers="+revers);
    }

    public static void main (String args[]){
    int m;
    reversclass aa=new reversclass();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number to find revers");
    m=sc.nextInt();
    aa.getdata(m);
    aa.putdata();
}

}