public class calpower {
    public static int calcpower(int x,int n) {
        if(n==0){
            return 1;

        }
        if(x==0){
            return 0;
        }
        int xpower1 = calcpower(x,n-1);
        int xpower = x * xpower1;
        return xpower;
    }
    public static void main(String[] args) {
        int x= 2,n=5;
        int ans = calcpower( x,  n);
        System.out.println(ans);
    }
    
}
