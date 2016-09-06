import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Jakob on 03-09-2016.
 */
public class is1to1 {
    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<>();

        map1.put("Smith","949-0504");
        map1.put("Marty", "206-9024");
        map1.put("Hawking","123-4567");
        map1.put("Newton","123-4567");

        Map<String, String> map2 = new HashMap<>();

        map2.put("Smith","949-0504");
        map2.put("Marty", "206-9024");
        map2.put("Hawking","555-4567");
        map2.put("Newton","123-4567");

            System.out.println(is1to1s(map1));
        System.out.println(is1to1s(map2));
    }

    public static boolean is1to1s(Map<String, String> input) {
        Set<String> uniqueValues = new HashSet<String>();

        if(input.isEmpty()){
            return true;
        }

        for (String value : input.values()) {
            if (uniqueValues.contains(value)) {
                return false;
            }
            uniqueValues.add(value);
        }
        return true;r
    }
}
