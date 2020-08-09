package StringRecursion.Assignment7;

public class Question11 {
    public static void main(String[] args) {
        String str = "(xyz)abcdef";
        System.out.println(brackets(str));
    }
    public static String brackets(String str){

        String answer = str.substring(str.indexOf("(")+1,str.indexOf(")"));
        return answer;

    }
}
