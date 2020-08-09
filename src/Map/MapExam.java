package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExam {
    public static void main(String[] args) {
        TreeMap<String,String> map = new TreeMap<>();

        String string = "abc";
        System.out.println(string.hashCode());
        map.put("orange","not good");
        map.put("mango","ok");
        map.put("apple","keeps doctor away");

        for (String str:map.keySet()) {
            System.out.println(str);
        }

        System.out.println(map);
        System.out.println(frequency("Raftar"));
        for (String stri:map.values()) {
            System.out.println(stri);
        }
    }
    public static HashMap<Character,Integer> frequency(String s){
        HashMap<Character,Integer> freq = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(freq.containsKey(ch))
                freq.put(ch,freq.get(ch)+1);
            else
                freq.put(ch,1);
        }
        return freq;
    }
}
