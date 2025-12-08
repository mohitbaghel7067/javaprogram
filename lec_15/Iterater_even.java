import java.util.ArrayList;
import java.util.ListIterator;

public class Iterater_even {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(9);
        ListIterator<Integer>it=List.listIterator();
        while (it.hasNext()) {
            Integer x=it.next();
            if(x%2==0){
        it.set(1);
            }
            
        }
        System.out.println(List);
    
}
    
}
