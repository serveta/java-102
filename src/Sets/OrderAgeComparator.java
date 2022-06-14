package Sets;

import java.util.Comparator;

public class OrderAgeComparator implements Comparator<MyClass> {
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.getAge() - o2.getAge();
    }
}
