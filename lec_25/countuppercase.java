public class countuppercase{
static int countUpper(String str) {
    if (str.length() == 0) return 0;

    char ch = str.charAt(0);

    if (Character.isUpperCase(ch)) {
        return 1 + countUpper(str.substring(1));
    } else {
        return countUpper(str.substring(1));
    }
}

public static void main(String[] args) {
    String str = "HeLLo";
    System.out.println(countUpper(str));
}


}