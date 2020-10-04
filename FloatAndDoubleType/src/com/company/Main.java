package com.company;

public class Main {

    public static void main(String[] args) {
	    // float - single precision number that occupies 32bits
        // double - double precision number that occupies 64 bits

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        // Challenge
        int poundValue = 200;
        double kilogramValueDouble = poundValue*0.45359237;
        float kilogramValueFloat = poundValue*0.45359237f;
        System.out.println("Double kilogram = " + kilogramValueDouble);
        System.out.println("Float kilogram = " + kilogramValueFloat);
    }
}
