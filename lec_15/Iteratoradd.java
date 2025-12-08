
import java.util.*;
public class Iteratoradd {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(9);
        ListIterator<Integer>it=List.listIterator();
        while (it.hasNext()) {
            Integer x=it.next();
            if(x==7){
               it.add(10);//7 ko remove nahi karaga but 10 ko add kar dega
                //it.set(10);//7 ko remove kar daga uski jaaga 10 print kar dega
            }
            
        }
        System.out.println(List);
    
}
}
//push