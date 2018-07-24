package Lap3;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //input
        System.out.print("Insert x : ");
        int x = scanner.nextInt();
        System.out.print("Insert y : ");
        int y = scanner.nextInt();
        //test condition
        if (x>y) System.out.println(x+"มากกว่า"+y);
        else System.out.println(y+"มากกว่า"+x);






    }//main
}
