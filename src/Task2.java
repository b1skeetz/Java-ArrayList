import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        Collections.addAll(list, 'a', 'b', 'a', 'a', 'c', 'a', 'f', 'f', 'a', 'a', 'z', 'f', 'f', 'f');
        List<Character> list2 = new ArrayList<>();
        Collections.addAll(list2, 'a', 'b');
        System.out.println(list);

        // Вариант 1
        for (int i = 0; i < list.size(); i++) {
            if (list2.contains(list.get(i))) {
                list.remove(i);
                i--;
            }
        }

        // Вариант 2
        list.removeAll(list2);

        // Вариант 3
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list.get(i) == list2.get(j)) {
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }

        System.out.println(list);
    }
}