import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.1 Подсчет повторяющихся символов
 */
public class Main {
    public static void main(String[] args) {
        String str = "I like programming because it produces dopamine";
        Map <Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            Character key = str.charAt(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue() + " ");
        }
        // 2 вариант распечатки
        System.out.println();
        System.out.print(Arrays.toString(map.entrySet().toArray()));
    }
}
