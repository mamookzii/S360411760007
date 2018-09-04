package Midterm_Exam;

import java.util.Scanner;

public class Midterm_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n, k;
        int m, h;

        System.out.println("อัตราโบนัสเงินเดือน");
        System.out.println("ชั่วโมงสอนน้อยกว่ำ 12 ชั่วโมง ไม่ได้รับโบนัส");
        System.out.println("ชั่วโมงสอน 12 - 16 ชั่วโมง ได้รับโบนัส 5% ของเงินเดือน");
        System.out.println("ชั่วโมงสอน 17-20 ชั่วโมง ได้รับโบนัส 10% ของเงินเดือน");
        System.out.println("ชั่วโมงสอน 21 ชั่วโมงเป็นต้นไป ได้รับโบนัส 15% ของเงินเดือน");


        System.out.println("ชื่อ-สกุล:  ");
        n = scanner.nextLine();
        System.out.println("คณะ:  ");
        k = scanner.nextLine();
        System.out.println("เงินเดือน:  ");
        m = scanner.nextInt();
        System.out.println("ชั่วที่สอน:  ");
        h = scanner.nextInt();


        if (h >= 0 && h < 12)
            System.out.println(m);
        else if (h >= 12 && h <= 16)
            System.out.println("เงินเดือนรวมโบนัส:  " + (m + (m * 0.05)));
        else if (h >= 17 && h <= 20)
            System.out.println("เงินเดือนรวมโบนัส:  " + (m + (m * 0.10)));
        else if (h >= 21)
            System.out.println("เงินเดือนรวมโบนัส:  " + (m + (m * 0.15)));


    }//main


}//class
