package com.company;

public class Main {

    public static void main(String[] args) {
        byte ByteNumber = 120;
        short ShortNumber = 25000;
        int IntNumber = 20000;

        long LongNumber = 50000  + 10*(((long)ByteNumber + (long)ShortNumber + (long)IntNumber));
        System.out.println("LongNumber = " + LongNumber);

    }
}
