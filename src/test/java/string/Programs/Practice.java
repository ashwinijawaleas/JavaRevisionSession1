package string.Programs;

import jdk.swing.interop.SwingInterOpUtils;
import org.testng.annotations.Test;

import java.util.*;

public class Practice {


    @Test
    public void oodEven() {
        String s="this is java ";
        char[] ch=s.replaceAll(" ","").toCharArray();
        int count=0;
        for(char c:ch){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println(count);




    }
    }



