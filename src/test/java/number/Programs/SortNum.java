package number.Programs;

import org.testng.annotations.Test;

import java.util.TreeSet;

public class SortNum {

    public static void main(String[] args) {

        SortNum xObj=new SortNum();
        xObj.sortNum();


    }
    public void sortNum () {
        int[] n = {12, 50, 23};
        int max = 0;
        TreeSet<Object> O = new TreeSet<Object>();

        for (int i = 0; i < n.length - 1; i++) {
            O.add(n[i]);
        }
        System.out.println(O.last());


    }
}

