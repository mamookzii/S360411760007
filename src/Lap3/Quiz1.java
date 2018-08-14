package Lap3;

public class Quiz1 {
    public static void main(String[] args) {

        int count = 0;
        for (int x = 500; x <= 1000; x++) {
            //statment for
            if (x % 3 == 0 && x % 6 == 0) {
                System.out.println(x + " ");
                count++;

            }//if
        }//for
        System.out.println("Number of Value is" + count);

    }//main
}//class
