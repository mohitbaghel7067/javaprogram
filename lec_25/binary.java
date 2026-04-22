public class binary {
    static String binary(int n){
        if(n==0) return "0";
        if(n==1) return "1";
        return binary(n/2)+binary(n%2);

    }
    public static void main(String[] args) {
        int  n=2;
        System.out.println(binary(n));
    }
}
