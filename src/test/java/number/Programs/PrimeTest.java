package number.Programs;

import org.testng.annotations.Test;

import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maximum Value");
        int n=sc.nextInt();
        sc.close();
        int num=2;
        while(num<=n) {
            TestPrime(num);
            num++;
        }

    }
    public static void TestPrime(int n){
        int maxD=n/2;
        int count=0;
        int d=2;
        for(int i=2;i<=maxD;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(n+" is Prime");
        }

    }
}
