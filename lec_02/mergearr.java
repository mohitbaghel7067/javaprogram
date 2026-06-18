public class mergearr {
  public static void main(String[] args) {
    int arra[]={1,3,5,7,8};
    int arrb[]={2,4,6,9,10};
    int i=0;
    int j=0;

    while(i<arra.length && j<arrb.length){
        if(arra[i]<=arrb[j]){
            System.out.print(arra[i] +" ");
            i++;
        }
        else{
            System.out.print(arrb[j] + " ");
            j++;
        }
    }
        while(i<arra.length){
            System.out.print(arra[i] + " ");
            i++;
        }
        while(j<arrb.length){
            System.out.print(arrb[j] + " ");
            j++;}
    }
  }  

