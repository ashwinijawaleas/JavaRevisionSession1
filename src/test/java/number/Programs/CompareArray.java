package number.Programs;

import org.testng.annotations.Test;

import java.util.Arrays;

public class CompareArray {

    @Test
    public void arrayCompare(){
        int[] x={1,2,3,4,5,6,7,8,9};
        int[] y={1,2,3,4,5,6,7,8,9};
        if(Arrays.equals(x,y)){
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
    }
}
