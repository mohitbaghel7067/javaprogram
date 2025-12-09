import java.util.ArrayList;
import java.util.ListIterator;

public class Iteratermid_revers {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(8);
        List.add(9);
        List.add(10);
        List.add(11);
        List.add(12);
        ListIterator<Integer>it=List.listIterator();
        int l=List.size();
        int m=l/2;
        //System.out.println(l);
        while(it.hasNext()&& it.nextIndex()<=m){
            Integer x=it.next();
            System.out.println(x);
        
        }
        while(it.hasPrevious()){
            Integer y=it.previous();
            System.out.println(y);
        }
 

        
 
    
}
    
}
