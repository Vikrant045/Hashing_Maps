import java.util.*;
public class Operations_HashMap{
    public static void main(String args[]){
HashMap<String,Integer> map = new HashMap<>();
map.put("india",120);
map.put("china",100);
map.put("usa",10);
map.put("aus",150);
System.out.println(map);
System.out.println(map.get("aus"));
System.out.println(map.containsKey("usa"));
map.remove("china");
System.out.println(map);


    }
}