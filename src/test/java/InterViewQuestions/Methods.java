package InterViewQuestions;

public class Methods {

    

    public static void m1(Object s){

        System.out.println("m1...");
    }
    public void m1(String s){
        System.out.println("m1......");
    }

    public static void main(String[] args) {
        Methods xObj=new Methods();
        Methods xObj2=new Methods();
        xObj.m1(null);

      String op = xObj.toString();
      System.out.println(op);
    }
}
