import java.util.Scanner;
public class longestword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("enter a string ");
        str=sc.nextLine();
        String[] words=str.split(" ");
        String longest =words[0];
        for(int i=0;i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest=words[i];
            }
        }
        System.out.println("longest word = "+longest);
    }
}
