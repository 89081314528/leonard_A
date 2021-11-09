import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 1.2 Найти первый неповторяющийся символ
 */
public class Main {
    public static void main(String[] args) {
        // 1 способ
        String str = "Lay beside me, tell me what they've done";
        String str2 = str.toLowerCase();
        System.out.println(str2);
        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            char ch1 = str2.charAt(i);
            for (int j = i; j < str2.length(); j++) {
                char ch2 = str2.charAt(j);
                if (ch1 == ch2) {
                    count++;
//                    if (count > 1) {
//                        count = 0;
//                        break;
//                    }      // как написать чтобы после выхода выполнялась не строка 27, а строка 16???
                }
            }
            if (count == 1) {
                System.out.println("Первый неповторяющийся символ = " + ch1);
                break;
            } else {
                count = 0;
            }
        }
        // 2 способ LinkedHashMap поддерживает порядок вставки ключей
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            char key = str2.charAt(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Первый неповторяющийся символ = " + entry.getKey());
                break;
            }
        }
    }
}
