package string.Programs;

import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.testng.annotations.Test;

public class SeparateCharNum {

    @Test
    public void CharNumSeparate(){
        String s="A154545Tssg3455353435534sssZ";
        String temp=s.replaceAll("[^A-Za-z]","");
        System.out.println("Only Char = "+temp );
        temp=s.replaceAll("[^0-9]","");
        System.out.println("Only Num = "+temp);

    }
}
