package Lap7;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Naputsorn",
                "MIT421",
                "Programmer",
                20000.00,
                "mookpakphanang@gmail.com");

        System.out.println(emp1.toString());
        emp1.setName("Naputsorn Phanchai");
        System.out.println(emp1.toString());


        Employee emp2 = new Employee();
        emp2 = inputdata(emp2);
        System.out.println(emp2.toString());

    }//main

    private static Employee inputdata(Employee emp) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:  ");
        emp.setName(sc.nextLine());
        System.out.print("Enter your id:  ");
        emp.setId(sc.nextLine());
        System.out.print("Enter your Position:  ");
        emp.setPosition(sc.nextLine());
        System.out.print("Enter your Email:  ");
        emp.setEmail(sc.nextLine());
        System.out.print("Enter your salary:  ");
        emp.setSalary(sc.nextDouble());


        return emp;

    }

}//class
