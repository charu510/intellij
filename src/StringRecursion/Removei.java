package StringRecursion;

public class Removei {
    public static void main(String[] args) {
        removei("","hihihi");
    }
    public static void removei(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        if(ch=='i')
            removei(processed,unprocessed);
        else
            removei(processed+'h',unprocessed);

    }
}
