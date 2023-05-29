package number.Programs;

import org.testng.annotations.Test;

public class NumbersInMultiple {
    @Test
    public void printNum(){
        int d=5;
        for(int i=1;i<=100;i++){
            if(i%d==0){
                System.out.println(i);
            }

        }
    }
}
