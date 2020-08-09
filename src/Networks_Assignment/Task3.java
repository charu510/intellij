package Networks_Assignment;

public class Task3 {
    public static void main(String[] args) {
        String polynomial= "1x^4+0x^3+1x^2+1x^1+1";
        coefficients(polynomial);
    }
    public static void coefficients(String polynomial){
        String[] parts = polynomial.split("x\\^\\d+\\+?");
        System.out.println("The key is:");
        for (String part : parts) {
            System.out.print(part);
        }
    }
}
