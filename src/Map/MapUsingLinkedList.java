package Map;

import java.util.LinkedList;

public class MapUsingLinkedList {

    LinkedList<Entity> list = new LinkedList<>();

    public void put(String key,String value){
        for (Entity entity:list) {
            if(entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }
        list.add(new Entity(key,value));
    }
    public String get(String key){
        for (Entity entity:list) {
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    public String remove(String key){
        Entity target = null;
        for (Entity entity:list) {
            if(entity.key.equals(key)){
               target = entity;
            }
        }
        String temp = target.value; //we are doing this because
        //remove is boolean type and we need the deleted value
        //so we store it in the corresponding temp and then return it.
        list.remove(target);
        return temp;
    }

    @Override
    public String toString() {
        String s="";
        s+="[";
        for(Entity entity:list){
            s+=(entity.key+"=>"+entity.value+",");
        }
        s+="]";
        return s;
    }

    class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

