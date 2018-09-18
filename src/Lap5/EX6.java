package Lap5;

import java.util.StringTokenizer;

public class EX6 {
    public static void main(String[] args) {

        //stringBuffer
        StringBuffer strBuf = new StringBuffer("I am at RUTSV");
        strBuf.insert(0, "MT: ");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());

        //stringBuilder
        StringBuilder strBui = new StringBuilder("I am at RUTSV");
        strBui.append(" :MT");
        System.out.println(strBui);
        System.out.println(strBuf.reverse());

        //stringTokenizer
        StringTokenizer strtok = new StringTokenizer("I am at RUTSV");
        System.out.println("Word count in message = " + strtok.countTokens());

        while (strtok.hasMoreElements()) {
            System.out.println(strtok.nextToken());

        }//while


    }//main


}//class
