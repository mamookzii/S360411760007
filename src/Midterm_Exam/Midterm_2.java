package Midterm_Exam;

import java.util.Scanner;

public class Midterm_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S, P, M, F;
        do {
            System.out.println("Subtest score:  ");
            S = scanner.nextInt();
            if (S > 20 || S < 0)
                System.out.println("Please enter a new score.");
        } while (S > 20 || S < 0);

        do {
            System.out.println("Practice score:  ");
            P = scanner.nextInt();
            if (P > 20 || P < 0)
                System.out.println("Please enter a new score.");
        } while (P > 20 || P < 0);

        do {
            System.out.println("Midterm Exam Score:  ");
            M = scanner.nextInt();
            if (M > 30 || M < 0)
                System.out.println("Please enter a new score.");
        } while (M > 30 || M < 0);


        do {
            System.out.println("Final Exam Score:  ");
            F = scanner.nextInt();
            if (F > 30 || F < 0)
                System.out.println("Please enter a new score.");
        } while (F > 30 || F < 0);


        System.out.println("All 4 points:  " + (S + P + M + F));


        if ((S + P + M + F) >= 0 && (S + P + M + F) <= 49)
            System.out.println("Your grade F.");
        else if ((S + P + M + F) >= 50 && (S + P + M + F) <= 59)
            System.out.println("Your grade D.");
        else if ((S + P + M + F) >= 60 && (S + P + M + F) <= 69)
            System.out.println("Your grade C.");
        else if ((S + P + M + F) >= 70 && (S + P + M + F) <= 79)
            System.out.println("Your grade B.");
        else if ((S + P + M + F) >= 80 && (S + P + M + F) <= 100)
            System.out.println("Your grade A.");
        else
            System.out.println("lnvalid score ");


    }//main
}//class
