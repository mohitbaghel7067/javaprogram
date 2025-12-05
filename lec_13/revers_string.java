import java.util.Scanner;
public class revers_string {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=new String();
    System.out.println("enter a string");
    str=sc.nextLine();
    int i,j,k;
    i=str.length()-1;
    while(i>=0){
      j=i;
      while(str.charAt(j)!=' '&&j>0)
        j--;
        if(j==0)
         k=0;
        else
            k=j+1;
        System.out.println(str.substring(k,i+1));
        i=j-1;
        sc.close();
    }
 }   
}
