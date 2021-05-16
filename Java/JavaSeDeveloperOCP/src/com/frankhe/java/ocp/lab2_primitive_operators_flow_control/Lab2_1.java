package com.frankhe.java.ocp.lab2_primitive_operators_flow_control;

public class Lab2_1 {
    public static void main(String[] args){
        byte x = 2, y = 3, z = 5;

//        result is int
//        z = x + y

        z = (byte)(x + y);
//        value convert to int
        System.out.println(z);

        float a  = (float)(x / y);
        System.out.println(a);

        a = (float) x / y;
        System.out.println(a);

        double b = (double) x / y;
        System.out.println(b);

        b = a;

//        assign bigger value to smaller variable
//        a = b;


        float c = Math.round(b*1000)/1000F;
        System.out.println(c);

        char a1 = 'a', a2 = '\141', a3 = '\u0061';
        System.out.println(a3);
        System.out.println(a2);
        System.out.println(a3);

        int i = a1;
        System.out.println(a1);

        int i1 = 0141, i2 = 0x61;
        System.out.println(i1);
        System.out.println(i2);

        char a4 = (char)i1;
        System.out.println(a4);

        char someChar = 'k';
        boolean isEven = (someChar%2 == 0);
        System.out.println(isEven);
        System.out.println('k'%2==0);
        System.out.println('j'%2==0);


        someChar = 'k';
        char nextChar = (char)(someChar + 1);
        System.out.println(nextChar);

        nextChar = ++someChar;
        System.out.println(nextChar);

        char some = (char)(z+1);
        System.out.println(some);

        someChar = 'b';
        --someChar;
        System.out.println(someChar);

        char upperA = 'A', lowerA = 'a';
        int distence = upperA - lowerA;
        System.out.println(distence);

        someChar = 'h';
        char upperSomeChar = (char)(someChar - 32);
        System.out.println(upperSomeChar);
    }
}
