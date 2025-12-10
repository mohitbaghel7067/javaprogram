//package lec_15;
import java.util.*;
import java.util.ListIterator;
public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(9);
        ListIterator<Integer>it=List.listIterator();
        while(it.hasNext()){
            Integer x=it.next();
            System.out.println(x);
        }
        while(it.hasPrevious()){
            Integer y=it.previous();
            System.out.println(y);
        }
 
    
}
}
