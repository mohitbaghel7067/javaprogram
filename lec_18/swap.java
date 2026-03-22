//package lec_18;
class swap{
    public static void main(String[] args){
        swap mf=new swap();
        int val1=10;
        int val2=20;
        mf.Swap( val1,val2);
    
}
public void  Swap(int val1,int val2) {
    System.out.println(val1+","+val2);
    int temp=val1;
    val1=val2;
    val2=temp;
System.out.println(val1+","+val2);
    
}
}//p