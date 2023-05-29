package string.Programs;


import org.testng.annotations.Test;

public class FirstCharecterCaps {
    @Test
    public void firstCaps(){
        String s="this is just a normal java program";
        String[] st=s.trim().split(" ");
        for (String value : st) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < value.length(); j++) {
                if (j == 0) {
                    temp.append(value.charAt(j));
                    temp = new StringBuilder(temp.toString().toUpperCase());
                } else {
                    temp.append(value.charAt(j));
                }
            }
            System.out.print(temp + " ");
        }
    }
}
