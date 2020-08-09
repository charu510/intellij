package StringRecursion.Assignment7;

public class StringTwins {
    public static void main(String[] args) {
        String str = "AxA";
        twins("",str);

    }
    public static void twins(String processed,String unprocessed) {
       if(unprocessed.length()==1){
           System.out.println(processed+unprocessed);
           return;
       }
       char ch = unprocessed.charAt(0);
       if(ch=='x')
           twins(processed,unprocessed.substring(1));
       else
           twins(processed+ch,unprocessed.substring(1));

    }

}


