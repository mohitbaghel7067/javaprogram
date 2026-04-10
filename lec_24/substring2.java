public class substring2 {
    public static void main(String[] args) {
        String Str1="a3b2c9d5e8";
        char max =0;
        for(int i=0;i<Str1.length();i++){
            char ch=Str1.charAt(i);
            if(ch>='0'&& ch<='9'&& ch>max){
                max =ch;

            }
        }
        System.out.println(max);
    }
}
