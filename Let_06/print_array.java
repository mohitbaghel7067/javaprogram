package Let_06;
import java.util.Scanner;
public class print_array {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        for(i=0;i<3;i++)
        for(j=0;j<3;j++){
            System.out.println("enter a element");
            a[i][j]= sc.nextInt();
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
    }
    
}
