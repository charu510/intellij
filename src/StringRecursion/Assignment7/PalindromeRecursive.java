package StringRecursion.Assignment7;

public class PalindromeRecursive {
    public static void main(String[] args) {
        String str = "liril";
        System.out.println(palincheck(str,0,str.length()-1));
    }
    public static boolean palincheck(String str,int start,int end){
        if(start==end)
            return true;
        if(str.charAt(start)!=str.charAt(end))
            return false;
        return palincheck(str,start+1,end-1);
    }
}
