public class single_elementII {
    public static void main(String[] args) {
    int a[]={1,2,1,1,2,6,8,8,3,2,4,8,6,6,9};

        for(int i=0;i<a.length;i++){
            int count =0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j])
                  count ++; 
            }
        
        if(count==1)
        System.out.println("single element = "+a[i]);
        }
}
}
