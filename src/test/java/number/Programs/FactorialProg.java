package number.Programs;

import org.testng.annotations.Test;

public class FactorialProg {

    @Test
    public void facto(){
        int n=5;
        long fact=1;
        while(n>=1){
            fact=fact*n;
            n--;


        }
        System.out.println("factorial of 5 ="+fact);

    }
}
