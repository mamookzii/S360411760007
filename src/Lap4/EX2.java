package Lap4;

import java.util.OptionalInt;
import java.util.Scanner;

//1.summation (+)
//2.subtraction (-)
//3.multiple (*)
//4.division (/)
public class EX2 {
    public static int summation(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiple(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, select;

        System.out.println("Please input 2 integers and choose your option.....");
        //input data
        System.out.println("input number 1: ");
        x = input.nextInt();
        System.out.println("input number 2: ");
        y = input.nextInt();
        //shoe option

        System.out.println("1.summation");
        System.out.println("2.subtraction");
        System.out.println("3.multiple");
        System.out.println("4.division");
        do {
            System.out.print("Option: ");
            select = input.nextInt();
        } while (select < 1 || select > 4);

        System.out.println("Option ");
        select = input.nextInt();
        int r = 0;
        switch (select) {
            case 1:
                r = summation(x, y);
                break;
            case 2:
                r = subtraction(x, y);
                break;
            case 3:
                r = multiple(x, y);
                break;
            case 4:
                r = division(x, y);
                break;
            default:
                System.out.println("Please select option (1-4) only.");


        }//switch

        System.out.println("Output : " + r);

    }//main


}//main



