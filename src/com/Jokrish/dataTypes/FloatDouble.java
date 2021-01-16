package com.Jokrish.dataTypes;

public class FloatDouble {
    public static void main(String[] args) {

        float myMinfloatvalue = Float.MIN_VALUE;
        float myMaxfloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value  = " +myMinfloatvalue);
        System.out.println("Float Maximum value  = " +myMaxfloatValue );

        double myMinfdoublevalue = Double.MIN_VALUE;
        double myMaxfdoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value  = " +myMinfdoublevalue);
        System.out.println("Double Maximum value  = " +myMaxfdoubleValue );

        int  myIntValue = 5 / 3;
        float myFloatvalue =  5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntvalue = "+myIntValue);
        System.out.println("MyFloatValue = "+myFloatvalue);
        System.out.println("MyDoublevalue = "+myDoubleValue);

    }
}