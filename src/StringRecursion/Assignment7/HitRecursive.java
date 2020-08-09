package StringRecursion.Assignment7;

public class HitRecursive {
    public static void main(String[] args) {
        String str="hihit";
        counting("",str,0);
        removing("",str);
    }
    public static void counting(String processed,String unprocessed,int count){
        if(unprocessed.length()==1){
            System.out.println(count);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch=='h' && unprocessed.charAt(1)=='i' && unprocessed.charAt(2)=='t')
            counting(processed+ch,unprocessed.substring(1),count);
        else if(ch=='h' && unprocessed.charAt(1)=='i')
            counting(processed+ch,unprocessed.substring(1),count+1);
        else
            counting(processed+ch,unprocessed.substring(1),count);

    }
        public static void removing(String processed, String unprocessed) {
            if (unprocessed.length() == 1) {
                System.out.println(processed+unprocessed);
                return;
            }
            char ch = unprocessed.charAt(0);
            if (ch == 'h' && unprocessed.charAt(1) == 'i' && unprocessed.charAt(2) == 't')
                removing(processed + ch, unprocessed.substring(1));
            else if (ch == 'h' && unprocessed.charAt(1) == 'i' && unprocessed.charAt(2) != 't')
                removing(processed, unprocessed.substring(2));
            else
                removing(processed + ch, unprocessed.substring(1));

        }
    }


