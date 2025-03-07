import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",1);
        map.put("Banana",2);
        map.put("Orange",3);
        map.put("Watermelon",4);
        map.put("Pineapple",5);

        System.out.println(map);
        System.out.println(map.get("Apple"));
        System.out.println(map.getOrDefault("Raspberry",0));
        System.out.println(map);
        System.out.println(map.values());
        System.out.println(map.keySet());
        for(var item: map.entrySet()){
            System.out.println(item.getValue());
        }
    }

}