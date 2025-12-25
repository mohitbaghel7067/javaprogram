import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(" ");
        System.out.println("enter a main string");
        String main=sc.nextLine();
        System.out.println("enter a sub string");
        String sub=sc.nextLine();
        boolean found=false;
        for(int i=0;i<=main.length()-sub.length();i++){
            char ch=str .charAt(0);
            int j;
            for(j=0;j<sub.length();j++){
                if(main.charAt(i+j)!=sub.charAt(j)){
                    break;
                }
            }
            if(j==sub.length()){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("sub string is present");
        }else{
         System.out.println("sub string not present");
        }
        sc.close();
    }
    
}
