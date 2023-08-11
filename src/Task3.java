import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        char[] words = new char[]{'a', 'b', 'b', 'a', 'c', 'a', 'c', 'z', 'a', 'a', 'z'};
        List<Character> duplicates = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (duplicates.contains(words[i])) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (words[i] == words[j]) {
                    duplicates.add(words[i]);
                    break;
                }
            }
        }
        for (int i = 0; i < duplicates.size(); i++) {
            System.out.print(duplicates.get(i) + " ");
        }
        System.out.println();
        System.out.println("----------");

        List<Character> words2 = new ArrayList<>();
        Collections.addAll(words2,'a', 'b', 'b', 'a', 'c', 'a', 'c', 'z', 'a', 'a');
        for (int i = 0; i < words2.size(); i++) {
            System.out.print(words2.get(i) + ", ");
        }
        for(int i = 0; i < words2.size(); i++){
            for (int j = i + 1; j < words2.size(); j++) {
                if (words2.get(i) == words2.get(j)) {
                    words2.remove(j);
                    j--;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < words2.size(); i++) {
            System.out.print(words2.get(i) + ", ");
        }
    }
}