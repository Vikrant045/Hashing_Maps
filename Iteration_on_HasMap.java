import java.util.*;
public class Iteration_on_HasMap {
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("india",120);
        map.put("china",100);
        map.put("usa",10);
        map.put("aus",150);
        
        Set<String>keys = map.keySet();

       for (  String k : keys) {
        System.out.println(map.get(k));
       }
        
            }
}
