package StringRecursion.Assignment7;

public class HiRecursive {
    public static void main(String[] args) {
        String str = "hhthi";
        counting("", str, 0);
        removing("", str);
        bye("", str);
    }

    public static void counting(String processed, String unprocessed, int count) {
        if (unprocessed.length() == 1) {
            System.out.println(count);
            return;
        }
        char ch = unprocessed.charAt(0);

        if (ch == 'h' && unprocessed.charAt(1) == 'i') {
            counting(processed, unprocessed.substring(1), count + 1);
        } else {
            counting(processed + ch, unprocessed.substring(1), count);
        }

    }

    public static void removing(String processed, String unprocessed) {
        if (unprocessed.length() == 1) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (ch == 'h' && unprocessed.charAt(1) == 'i')
            removing(processed, unprocessed.substring(1));
        else
            removing(processed + ch, unprocessed.substring(1));

    }


    public static void bye(String processed, String unprocessed) {
        if (unprocessed.length() == 1) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (ch == 'h' && unprocessed.charAt(1) == 'i')
            bye(processed + "bye", unprocessed.substring(1));
        else
            bye(processed + ch, unprocessed.substring(1));

    }
}




