package string.Programs;

import org.testng.annotations.Test;

public class SwapWords {
    @Test
    public void swap(){
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
        String x="this";
        String y="is";
        x=y+x;

        System.out.print(x.substring(0,y.length())+" ");
        System.out.print(x.substring(y.length(),x.length()));


    }
}
