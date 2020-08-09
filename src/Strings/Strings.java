package Strings;

public class Strings {
    public static void main(String[] args) {
        String str = "aella";
        locations(str);
    }
    public static void locations(String str){
        int index=0;
        while(true){
            index=str.indexOf('a',index);
            if(index==-1){
                break;
            }
            System.out.println(index);
            index=index+1;
        }
    }
}
