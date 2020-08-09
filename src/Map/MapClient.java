package Map;

public class MapClient {
    public static void main(String[] args) {
        MapUsingArrays map = new MapUsingArrays();

        map.put("orange","gadha");

        //map.put("mango","theek");
        map.put("grape","delicious");

        System.out.println(map.get("orange"));
        System.out.println(map.remove("orange"));
        System.out.println(map.get("orange"));

        System.out.println(map);
    }
}
