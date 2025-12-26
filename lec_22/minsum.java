public class minsum {
    public static void main(String[] args) {
        int []nums={-3,2,-3,4,2};
        int sum=0;
        int minsum=0;
        for(int i=0;i<nums.length;i++){
             sum=sum+nums[i];
             if(sum<minsum){
                minsum=sum;
             }
        }
        int startingvalue=1-minsum;
        System.out.println("minum starting value = "+startingvalue);
    }
}
