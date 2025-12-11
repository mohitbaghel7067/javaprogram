//package lec_16;

public class handlingstring {
     public static void main(String[] args) {
        System.out.println("hello");
        
        try{
        String str=null;
            System.out.println(str);
        }catch(NegativeArraySizeException e){
            System.out.println(e);
        }
        System.out.println("byee!!");
    }
    
}//p
