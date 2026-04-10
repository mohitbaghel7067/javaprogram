public class substring {
    public static void main(String[] args) {
      String sc = "abcd";
      int n=sc.length();
     
      for(int i=0;i<n;i++)
        {
for(int j=i+1;j<=n;j++){
    System.out.println(sc.substring(i,j));
}
      }
    }
}
