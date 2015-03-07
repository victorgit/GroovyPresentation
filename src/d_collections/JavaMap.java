package d_collections;

import java.util.HashMap;
import java.util.Map;

    public class JavaMap {
        static Map<String, Integer> javaMap =
                new HashMap<String, Integer>();

        static {
            javaMap.put("a", 1);
            javaMap.put("b", 2);
            javaMap.put("c", 3);
        }

        static Integer getValueFromMap(String key) {
            if (!javaMap.containsKey(key)) {
                return 1975;
            }
            return javaMap.get(key);
        }
    }


