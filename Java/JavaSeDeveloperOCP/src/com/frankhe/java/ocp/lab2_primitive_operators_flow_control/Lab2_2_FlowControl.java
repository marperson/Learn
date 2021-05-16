package com.frankhe.java.ocp.lab2_primitive_operators_flow_control;

public class Lab2_2_FlowControl {
    char test1(char someChar) {
        if (someChar >= 'a' && someChar <= 'z') {
            someChar -= 32;
        } else {
            someChar += 32;
        }
        return someChar;
    }

    char test2(char someChar){
        someChar = (someChar >= 'a' && someChar <= 'z') ? (char)(someChar - 32) : (char)(someChar + 32);
        return someChar;
    }

    char test3(char someChar) {
        if (someChar >= 'a' && someChar <= 'z') {
            someChar -= 32;
        } else {
            if (someChar >= 'A' && someChar <='Z') {
                someChar += 32;
            }
        }
        return someChar;
    }

    float test4(int period){
//        int period = 1;
        float amount = 10;
        float rate = 0.05F;

        //compou nd interest
        switch (period){
            case 4:
                amount += amount * 0.2F; break;
            case 3:
                amount += amount * rate;
            case 2:
                amount += amount * rate;
            case 1:
                amount += amount * rate;

        }

        return amount;
    }
    public static void main(String[] args){
        Lab2_2_FlowControl test = new Lab2_2_FlowControl();
        char inputChar = 'q';
//        char myChar = test.test1(inputChar);
//        char myChar = test.test2(inputChar);
//        char myChar = test.test3('r');
        char myChar = test.test3('#');
        System.out.println(myChar);

        System.out.println(test.test4(4));
        System.out.println(test.test4(3));


    }
}
