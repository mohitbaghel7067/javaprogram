//package lec_11;
import java.util.HashSet;
public class check_duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4};
        HashSet<Integer>set=new HashSet<>();
        for(int x:arr){
            if(set.contains(x)){
                System.out.println(true);
                return ;

            }
            set.add(x);}
            System.out.println(false);

        } 
    }

