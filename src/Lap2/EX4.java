package Lap2;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //input
        //name
        System.out.print("What is your name?: ");
        String name = scanner.nextLine();
        //age
        System.out.print("How own are you?: ");
        int age = scanner.nextInt();
        //weight
        System.out.print("What is your weigh?: ");
        double weight = scanner.nextDouble();

        //output
        System.out.println("Hello, "+name);
        System.out.println("Your are "+age+" years old.");
        System.out.println("Your weight "+weight);










    }//main





}//class
