package com.company;

public class Main {

    public static void main(String[] args) {
        byte ByteNumber = 10;
        short ShortNumber = 20;
        int IntNumber = 50;

        long LongNumber = 50000L  + 10L*((ByteNumber + ShortNumber + IntNumber));
        System.out.println("LongNumber = " + LongNumber);

    }
}
