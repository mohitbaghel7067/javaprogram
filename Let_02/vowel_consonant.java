import java.util.Scanner;
public class vowel_consonant {
 public static void main(String[] args) {
   String s=new String();
   int i,vowel=0,con=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a string");
   s=sc.nextLine();
   s=s.toUpperCase(); 
   for(i=0;i<s.length();i++){
    char c=s.charAt(i);
    if(c!=' '){
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            vowel++;
        else
            con++;
    }

   }
   System.out.println("vowel = "+vowel);
   System.out.println("consonant = "+con);
 }  
}

