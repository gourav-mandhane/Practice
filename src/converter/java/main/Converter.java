package converter.java.main;

import java.util.LinkedHashMap;
import java.util.Map;

public class Converter {
    private static Map<Integer, String> romanMap= new LinkedHashMap<>();
    static {
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");
    }
    public String convert(int number) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, String> entry: romanMap.entrySet()) {
            while (number >= entry.getKey()) {
                sb.append(entry.getValue());
                number = number - entry.getKey();
            }
        }
        return sb.toString();
    }
}
