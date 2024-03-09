package hashing.hashmap.implementation;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MapUsingHash map = new MapUsingHash(); // not very optimized
        map.put("Vikash", "7");
        map.put("Aman", "4");
        map.put("Suraj", "6");
        System.out.println(map.get("Vikash"));
        System.out.println(map.get("Aman"));
    }
}

class MapUsingHash{
    private Entity[] entities;

    public MapUsingHash(){
        entities = new Entity[100];
     // Entity class mein jo bhi present hoga uska array banyenge
    }
    public void put(String key,String value){
        int hash = Math.abs(key.hashCode() %  entities.length);
        entities[hash] = new Entity(key, value); // not good one not chaining noting
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() %  entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
                return entities[hash].value;
        }
        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() %  entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            entities[hash].key = null;
        entities[hash].value = null;
    }
    }

    private class Entity{
        String key;
        String value;

        public Entity(String key,String value){
            this.key = key ;
            this.value = value;
        }
    }
}