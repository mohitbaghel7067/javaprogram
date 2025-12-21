 import java.util.Scanner;
 public class frequencycount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("enter a string");
        str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(str.indexOf(ch)== i){
                int count = str.length() - str.replace(ch + "", "").length();
                System.out.println(ch + " = " + count);
            }
        }
    }
}
