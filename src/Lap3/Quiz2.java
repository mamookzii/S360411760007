package Lap3;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
    int select;
    double price=0, total=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("####### Please select product type #######\n");

    System.out.print("Type 1 10%");
    System.out.print("Type 2 15%");
    System.out.print("Type 3 17%");
    System.out.print("Type 4 20%");

    System.out.print("Select: ");
    select = sc.nextInt();
    System.out.print("Price: ");
    price = sc.nextDouble();


    switch (select) {
        case  1: total = price + (price*0.1); break;
        case  2: total = price + (price*0.15);break;

    }//switch


    }//main
}//class
