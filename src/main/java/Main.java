/**
 * Инвертирование букв и слов
 * Сначала переставим буквы в каждом отдельном слове. Потом переставим буквы и слова.
 */
public class Main {
    public static void main(String[] args) {
        String str = "Весна лето осень зима и снова весна";
        System.out.println("str = " + str);

        reverseWords(str);
        reverseAll(str);
    }

    private static void reverseAll(String str) {
        StringBuilder allReverse = new StringBuilder(str).reverse();
        System.out.println(allReverse.toString());
    }

    private static void reverseWords(String str) {
        String[] strArray = str.split(" ");
        StringBuilder wordsReverse = new StringBuilder();
        for (String s : strArray) {
            StringBuilder sReverse = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                sReverse = sReverse.append(s.charAt(i));
            }
            wordsReverse = wordsReverse.append(sReverse + " ");
        }
        System.out.println(wordsReverse.toString());
    }
}
