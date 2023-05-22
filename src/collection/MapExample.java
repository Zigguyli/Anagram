package collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(26, "vlad");
//        map.put(51, "elon");
//
//        String nameVlad = map.get(26);
//        System.out.println(nameVlad);
//
//        int size = map.size();
//        System.out.println(size);
//
//        map.remove(51);
//        System.out.println(map.toString());
        //O(1), O(n), O(log n)





        // step 1: BYE --> #26435
        // step 2: #26435 --> *(типа шестеренка) --> 2
        // step 3: 2 --> BYE(это ключ) + (значение)




        Map<String, Integer> map = new HashMap<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

