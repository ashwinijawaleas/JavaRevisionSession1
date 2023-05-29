package number.Programs;

import org.testng.annotations.Test;

import java.util.*;

public class SortArray {
    @Test
    public void sort() {
        int[] a = {5, 20, 4, 7, 8, 25};
        TreeSet<Object> ts = new TreeSet<>();
        for (int x : a) {
            ts.add(x);
        }
        ArrayList al = new ArrayList<>();
        for (Object x : ts) {
            al.add(x);
        }
        Collections.reverse(al);
        System.out.println(al);
    }

    @Test
    public void removeDuplicates() {
        String s = "This is is is just just a java java program program";
        String st[] = s.trim().split(" ");
        LinkedHashSet lh = new LinkedHashSet<>(List.of(st));
        for (Object x : lh) {
            System.out.print(x + " ");
        }

    }
}

