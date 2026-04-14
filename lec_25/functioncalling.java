
public class functioncalling {
    public static void main(String[] args){
        ajay(1);

    }

public static void ajay(int n) {
    if(n==10){
    System.out.println("mohit");
    return;
    }
    ajay(n+1);

}
}
