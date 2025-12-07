
public class recursionfabonacci {
    public static void printfab(int a,int b,int n) {
        if(n==0){
            return ;
        }
        int c=a + b;
        System.out.println(c);
        printfab(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n= 7;//jha tak niklana hai yah update kar de
        System.out.println(a);
        System.out.println(b);
        printfab(a, b, n-2);
        
    }
}
