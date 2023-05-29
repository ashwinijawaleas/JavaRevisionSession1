package string.Programs;

import org.testng.annotations.Test;

public class SeparateEvenOdd {

    @Test
    public void sepateEvenOdd() {
        String s = "This is just a Test Java Program";
        String st[] = s.trim().split(" ");
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < st.length; i++) {
            if (i % 2 == 0) {
                odd.append(st[i]).append(" ");
            } else {
                even.append(st[i]).append(" ");
            }
        }
        System.out.println("Even index words are ");
        System.out.println(even);
        System.out.println("Odd index words are ");
        System.out.println(odd);


    }
}
