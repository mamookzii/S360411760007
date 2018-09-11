package Lap5;


import java.util.Arrays;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Please, enter integers number: ");

        //input

        for (int i = 0; i < num.length; i++) {
            System.out.print("enter integer" + (i + 1) + ":");
            num[i] = scanner.nextInt();
        }//for

        //output
        //         System.out.println("Data in Array following: ");
        //     for (int i = 0; i < num.length; i++) {
        //         System.out.print(num[i]+" ");
        //
        // }//for
        //output2


        showData(num);
        maxData(num);
        mookData(num);
        manData(num);
        meeData(num);
    }//main

    private static void meeData(int[] num) {
        Arrays.sort(num);
        System.out.println("Sorting data: \n");
        showData(num);
    }


    private static void manData(int[] num) {
        int total = 0;
        for (int val : num) {
            total += val;
        }//for
        System.out.println("The maximum value is: " + (total / num.length));


    }//man

    private static void mookData(int[] num) {
        int mook = num[0];
        for (int i = 0; i < num.length; i++) {
            if (mook > num[i]) mook = num[i];
        }//for

        System.out.println("The maximum value is: " + mook);
    }//mook


    private static void maxData(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) max = num[i];
        }//for
        System.out.println("The maximum value is: " + max);
    }//max

    private static void showData(int[] num) {
        System.out.print("Data in Array following: ");
        for (int val : num) {
            System.out.println(val + " ");

        }//for


    }

}//class
