package number.Programs;

import org.testng.annotations.Test;

public class Palindrome {
    @Test
    public void palindromeTest() {
        int n = 1221;
        String s = String.valueOf(n);
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        int op=Integer.parseInt(rev);
        System.out.println(op);
        if(n==op){
            System.out.println("number is palindrome");
        }



    }

}
