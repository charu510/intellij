package Strings;

public class PrintSub {
    public static void main(String[] args) {
        substring("hello");
        System.out.println(plalincheck("abba"));
    }
    public static void substring(String str){
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static boolean plalincheck(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
