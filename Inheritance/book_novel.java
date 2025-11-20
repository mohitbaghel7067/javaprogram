package Inheritance;
import java.util.Scanner;
public class book_novel {
    public static void main(String[] args) {
        novel n=new novel();
        n.read();
        n.storyline();
    }
}
class Book{
    void read(){
        System.out.println("book is reading by student");
    }
    
}
class novel extends Book {
    void storyline(){
        System.out.println("the novel has an interesting storyline");
    }
}
public class book_novel {
    public static void main(String[] args) {
        novel n=new novel();
        n.read();
        n.storyline();
    }
}