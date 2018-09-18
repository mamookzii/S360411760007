package Lap5;

public class EX5 {
    public static void main(String[] args) {

        String msgl = " Hello ";
        //lenght();
        System.out.println(msgl.length());
        System.out.println("*" + msgl + "*");
        System.out.println("*" + msgl.trim() + "*");
        System.out.println(msgl.toUpperCase());
        //compere String

        String msg2 = "MIT421";
        String msg3 = "MIT421";
        String msg4 = "MT MIT421";
        //==

        if (msg2 == msg3)
            System.out.println("Yes");
        else
            System.out.println("No");
        if (msg3 == msg4)
            System.out.println("Yes");
        else
            System.out.println("No");
        //equals()
        if (msg2 == msg3)
            System.out.println("Yes");
        else
            System.out.println("No");
        if (msg3 == msg4)
            System.out.println("Yes");
        else
            System.out.println("No");
        //compereTo()

        if (msg2.compareTo(msg4) == 0)
            System.out.println("2 String are equal.");
        else if (msg2.compareTo(msg4) >= 1)
            System.out.println("msg2 more than msg3");
        else
            System.out.println("msg2 less then msg3");


    }//main
}//class
