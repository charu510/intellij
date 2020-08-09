package Map;

import java.util.ArrayList;
import java.util.LinkedList;

public class MapUsingArrayList {
    ArrayList<LinkedList<Entity>> entities = new ArrayList<>();

    public MapUsingArrayList() {
        for (int i = 0; i <10 ; i++) {
            entities.add(new LinkedList<>());
        }
    }
    public void put(String key,String value){
        int index = Math.abs(key.hashCode()%entities.size());
        LinkedList<Entity> list = entities.get(index);

        for (Entity entity:list) {
            if(entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }
       list.add(new Entity(key,value));
    }
    public String get(String key){
        int index = Math.abs(key.hashCode()%entities.size());
        LinkedList<Entity> list = entities.get(index);

        for (Entity entity:list) {
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }
//    public static String remove(String key){
////        int index = Math.abs(key.hashCode()%entities.size());
////        LinkedList<Entity> list = entities.get(index);
//
//    //}

    class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
