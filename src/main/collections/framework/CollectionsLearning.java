package collections.framework;

import java.util.*;

public class CollectionsLearning {
    private static final List<String> list;

    static {
        List<String> tmpList = new LinkedList<String>();
        tmpList.add("One");
        tmpList.add("Two");
        tmpList.add("Three");
        tmpList.add("One");
        tmpList.add("Two");
        tmpList.add("Three");
        tmpList.add("One");
        tmpList.add("Two");
        tmpList.add("Three");
        tmpList.add("One");
        tmpList.add("Two");
        tmpList.add("Three");

        list = new ArrayList<String>();
        list.add("Hello");
        list.addAll(tmpList);
    }


    public static void main(String[] args) {
        System.out.println(list);

        Map<String, String> map = new HashMap<String, String>();
        map.put("123", "123");
        map.put("123", "123");

        LinkedHashMap<String, String> linked = new LinkedHashMap<String, String>();

        linked.put("", "");
        linked.get("");

    }
}
