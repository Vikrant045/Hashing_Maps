import java.util.*;


public class SortByFrequency {
    public static String sort(String st){

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
           map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);

    }
    public static void main(String args[]){
         String st ="tree";
        System.out.println(sort(st)); 
    }

    
}
