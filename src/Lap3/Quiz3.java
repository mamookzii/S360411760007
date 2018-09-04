package Lap3;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select=0,night=0;
        double total;

        do {
            System.out.println("####### Please select Room type #######");
            System.out.println("Room Type 1: 600THB");
            System.out.println("Room Type 2: 1200THB");
            System.out.println("Room Type 3: 1800THB");
            System.out.println("Room Type 4: 2100THB");
            System.out.print("Select: ");
            select = sc.nextInt();
        } //do

        while (select<1 || select>4);

        System.out.print("Night: ");
        night = sc.nextInt();

        if (select ==1)
            total = 600*night;
        else if (select ==2)
            total = 1200*night;
        else if (select ==3)
            total = 1800*night;
        else  total = 2100*night;

        System.out.println("Total price: "+total+" THB.");




    }//main
}//class
