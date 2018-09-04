package Lap4;

import java.util.Scanner;

public class Quiz_2 {
    private  static  final double PI = 3.1414;
    private  static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int select=0;
        do {
            System.out.println("Please select the volumetric geommetry follwin");
            System.out.println("1.Sphere");
            System.out.println("2.Cylinder");
            System.out.println("3.Cone");
            System.out.println("4.Exit");
            System.out.println("Select: ");
            select = sc.nextInt();

            switch (select) {
                case  1:
                    sphereVolum();break;
                case  4:
                    System.out.println("Good bye !!!");
                    System.exit(1);break;


            }//switch
        }//do

        while (select != 4);

    }//main

    private  static void sphereVolum(){
        double r,v;
        System.out.print("Input the Radius (r) in centimeters: ");
        r = sc.nextDouble();
        v = (4/3)*PI *r * r * r;

        System.out.println("The volum of Sphere : "+v);



    }//sphereVolum


}//class
