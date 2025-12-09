import java.util.ArrayList;
import java.util.Iterator;
public class Iterater {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(9);
        Iterator<Integer>it=List.iterator();
        while(it.hasNext()){
            if(it.next()==6){
                it.remove();
            }
        }
        System.out.println(List);
    }
    
}
