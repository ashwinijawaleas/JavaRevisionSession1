package string.Programs;

import org.testng.annotations.Test;

import java.util.Locale;

public class ToatlWhiteSpaces {

    @Test
    public  void whiteSpaceCount(){
        String s="This is just a test java Program";
        s=s.trim();
        String st[]=s.split("");
        int count=0;
        int Ta=0;
        for(String temp:st){

            if(temp.equalsIgnoreCase(" ")){
                count++;
            }
            if(temp.equalsIgnoreCase("a")){
                Ta++;
            }
        }
        System.out.println("Total White Spaces = "+count);
        System.out.println("Total Char 'a' are = "+Ta);



    }
}
