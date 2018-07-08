import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Test {

    Test() {
        for (int i = 0; i < 11; i++) {
            this.sortedSet.add(i);
        }
        m.put(5,"a");
        m.put(5,"b");
    }

    private HashMap<Integer, String> m = new HashMap<>();

    private SortedSet<Integer> sortedSet = new TreeSet<>();

    Integer getNextElement(Integer elem) {

        Iterator<Integer> iterator = sortedSet.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (current >= elem) {
                if (iterator.hasNext()) {
                    return iterator.next();
                } else throw new IllegalArgumentException("Следующего числа нет");
            }
        }
        throw new IllegalArgumentException("Такого числа нет");
    }
}
