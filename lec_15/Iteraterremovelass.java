import java.util.ArrayList;
import java.util.ListIterator;

public class Iteraterremovelass {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(20);
        List.add(6);
        List.add(7);
        List.add(13);
        List.add(9);
        List.add(10);
        List.add(11);
        List.add(12);
        ListIterator<Integer>it=List.listIterator();
        int t=10;

        while(it.hasNext()){ 
            Integer x=it.next();
            if(x==t)
            break;
        
        }
        
        
        while(it.hasPrevious()){
            Integer y=it.previous();
            if(y<t){
                it.remove();
            }
            
        }
        System.out.println(List);
    
}
}
