package Lap3;

import java.util.Scanner;

public class BMRcal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("เพศ : ");
        String G = scanner.nextLine();

        System.out.println("ความสูง : ");
        int H = scanner.nextInt();

        System.out.println("น้ำหนัก : ");
        double W = scanner.nextDouble();

        System.out.println("อายุ : ");
        int A = scanner.nextInt();
        double BMR;
        if (G=="ชาย")
         BMR = 66+(13.7 * W)+(5*H)-(6.8*A);
        else
         BMR = 655+(9.6*W)+(1.8*H)-(4.7*A);

        System.out.println("Your BMR : " + BMR);


    }//main

    }

