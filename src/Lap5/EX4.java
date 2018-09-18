package Lap5;

import java.util.ArrayList;
import java.util.jar.JarEntry;

public class EX4 {
    public static void main(String[] args) {

        ArrayList mylist = new ArrayList();

        mylist.add("Mook");
        System.out.println(mylist);
        mylist.add("May");
        mylist.add("j");
        mylist.add("swiss");
        mylist.add("Q");
        System.out.println(mylist);
        mylist.add(2, "Both");
        System.out.println(mylist);
        //remove
        mylist.remove(4);
        System.out.println(mylist);
        mylist.remove("Both");
        System.out.println(mylist);
        //indexof()
        System.out.println(mylist.indexOf("J"));
        //size
        System.out.println(mylist.size());


    }//main


}//class
