package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;
import java.util.Map;

public class MapUtilities {
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        return (int) map1.entrySet().stream()
                .filter(entry -> map2.containsKey(entry.getKey()) && 
                                map2.get(entry.getKey()).equals(entry.getValue()))
                .count();
    }
}
//*https://commons.apache.org/proper/commons-collections/apidocs/org/apache/commons/collections4/MapUtils.html
