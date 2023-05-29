package number.Programs;



public class OneToHundred {

    public static void main(String[] args) {
        String one="a";
        String ten="..........";
        int n=one.length();
        int maxN=ten.length();
        numPrint(n,maxN);


    }
    public static  void numPrint(int num,int maxN){
        if(num<=(maxN*maxN)){
            System.out.println(num);
            num++;
            numPrint(num,maxN);
        }


    }
}
