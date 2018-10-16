package Lap8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number[] = {10, 20, 30, 40, 50};
        try {
            System.out.print("enter an integer: ");
            int x = sc.nextInt();
            System.out.println("integer: " + x);
            try {
                System.out.println("number[" + x + "]:" + number[x]);
            } catch (InputMismatchException ex) {
                System.out.println("Exception: " + ex);
            } finally {
                number[0] = 100;
                System.out.println(number[0]);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Exception");
        }

        System.out.println("Complete.");


    }//main
}//class
