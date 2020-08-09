package StringRecursion.Assignment7;

public class RemoveX {
    public static void main(String[] args) {
        String str = "abexexdexed";
        removeX("",str,0);
    }
    public static void removeX(String processed,String unprocessed,int count){
        if(unprocessed.isEmpty()){

            while(count>0){
                removeX(processed+'x',unprocessed,count-1);
            }
            System.out.println(processed);
           return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        if(ch=='x') {
            removeX(processed, unprocessed,count+1);
        }

        else
            removeX(processed+ch,unprocessed,count);
    }


}
