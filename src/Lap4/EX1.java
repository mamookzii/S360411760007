package Lap4;

public class EX1 {
    public static void B(String msg) {

        System.out.println(msg);

    }//B

    public static void main(String[] args) {

        System.out.println("Hello Main.");
        //call A()
        A();
        System.out.println("Hello Main. 2");
        //call B()
        B("moook");
        //call
        int num = C(10, 10); //20
        System.out.println(num);
        System.out.println(C(20, 20)); //40

    }//main

    public static void A() {
        //method body
        System.out.println("Hello A.");

    }//A

    public static int C(int x, int y) {
        System.out.println("Hello C.");
        return x + y; //int


    }//C


}//class
