package com.Jokrish.dataTypes;

public class ByteIntShortLong {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntvalue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value  = " +myMinIntvalue);
        System.out.println("Integer Maximum value  = " +myMaxIntValue );
        System.out.println("Busted MAX value  = " + (myMaxIntValue+1));
        System.out.println("Busted Min value  = " + (myMinIntvalue-1));

        int intMaxValue =  2_147_483_647;

        byte myMinBytevalue = Byte.MIN_VALUE;
        byte myMaxBytevalue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value   = " + (myMinBytevalue));
        System.out.println("Byte Max Value   = " + (myMaxBytevalue));

        short myShortValue = 100;
        System.out.println("Short min value = " + Short.MIN_VALUE);
        System.out.println("Short max value = " + Short.MAX_VALUE);

        long myLongValue = 100L;
        System.out.println("Long min value = "+ Long.MIN_VALUE);
        System.out.println("Long max value = "+ Long.MAX_VALUE);

        long bitLongValue = 2_147_483_647_234L;

        //Casting

        short myNewShortValue = (short) (myShortValue/2);
        byte myNewByteValue = (byte)(myMinBytevalue/2);

        //Exercise

        byte byteNumber = 10;
        short shortNumber = 20;
        int intNumber = 50;
        long longNumber = 50000L+10L*(byteNumber+shortNumber+intNumber);
        System.out.println("Calculated Long Number  = "+longNumber);

        short shortTotal = (short) (1000 + 10 * (byteNumber+shortNumber+intNumber));
        System.out.println("Short Total value  = "+shortTotal);



    }
}
