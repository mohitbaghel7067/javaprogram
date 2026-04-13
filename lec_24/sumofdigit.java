public class sumofdigit {
    static int sumofdigit(int x){
      if(x==0)return 0;
      return x%10+sumofdigit(x/10);
    }
    public static void main(String[] args) {
        int x=12345;
       System.out.println(sumofdigit(x));
        
    }
}
