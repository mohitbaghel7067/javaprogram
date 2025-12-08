public class recursionpower {
    public static int calculatepower(int x,int n) {
        if(n==0){
            return 1;//base case 1
        }
        if(x==0){
            return 0 ;//base case 2
        }
        int xpowernm1= calculatepower( x, n-1);
        int xpowern=x*xpowernm1;          //kaam
        return xpowern ;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans= calculatepower(x,n);
        System.out.println("answer = "+ans);
        
    }

}
