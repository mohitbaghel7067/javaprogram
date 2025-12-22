import java.util.Scanner;
public class stringanagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("emter a string 1");
        String s1=sc.nextLine().toLowerCase().trim();
        System.out.println("enter a string 2");
       String s2=sc.nextLine().toLowerCase().trim();
       if(s1.length()!=s2.length()){
        System.out.println("string not anagram");
        return;
       }
       int count[]=new int[256];
       for(int i=0;i<s1.length();i++){
        char ch=str.charAt(i);
        count[s1.charAt(i)]++;
        count[s2.charAt(i)]--;
       }
       for(int i=0;i<256;i++){
        if(count[i]!=0){
            System.out.println("string not anagram");
            return;
        }
       }
       System.out.println("string anagram");
       sc.close();
    }
}
