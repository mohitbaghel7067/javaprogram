package Let_06;
import java.util.Scanner;
public class addition {
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    void getdata(){
        int i=0,j=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++)
        for(j=0;j<3;j++){
        System.out.println("enter a element");
        a[i][j]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        for(j=0;j<3;j++){
            System.out.println("enter a element");
            b[i][j]=sc.nextInt();
        }
    }
    void add(){
        int i,j;
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
            c[i][j]=a[i][j]+b[i][j];
        
    }
    void putdata(){
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
            System.out.print(c[i][j]+"    ");
        }
            System.out.println();
    }
        
    }
}
class sum{
    public static void main(String[] args) {
        addition aa=new addition();
        aa.getdata();
        aa.add();
        aa.putdata();
    }
}
