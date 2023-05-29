package number.Programs;

import org.testng.annotations.Test;

public class Fibonacci {

    @Test
    public void fibonaci(){
        int first=0;
        int second=1;
        int next=0;
        int last=100;
        System.out.print(first+" "+second+" ");
        while(next<=last){
            next=first+second;
            first=second;
            second=next;
            if(next<=last){
                System.out.print(next+" ");
            }

        }

    }
}
