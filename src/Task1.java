import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        Collections.addAll(list, 'a', 'b', 'a', 'a', 'c', 'a', 'a', 'a', 'z', 'f');
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == 'a'){
                list.remove(i);
                i -= 1;
            }
        }
        System.out.println(list);
    }
}