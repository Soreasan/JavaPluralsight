/*
Kenneth Adair
Demo of type conversions in Java.
Following along with Pluralsight's Java Fundamentals course.
*/

public class TypeConversion{
    public static void main(String args[]){
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = (short) longVal;
        short result2 = (short) (byteVal - longVal);
        long result3 = (long) (longVal - floatVal);
        long result4 = (long) (shortVal - longVal + floatVal + doubleVal);

        System.out.println("Success!");
    }
}
