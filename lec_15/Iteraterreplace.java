import java.util.ArrayList;
import java.util.ListIterator;

public class Iteraterreplace {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(-1);
        List.add(6);
        List.add(-4);
        List.add(9);
        ListIterator<Integer>it=List.listIterator();
        while (it.hasNext()) {
            Integer x=it.next();
            if(x<0){
               it.set(x*-1);
                
            }
            
        }
        System.out.println(List);
    
}
    
}
