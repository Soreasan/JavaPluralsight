/**
Parameters passed into methods are passed by
value rather than by reference, this means
any changes you make to the inputs will
not affect the actual variables you passed
into the class
*/

import java.util.*;

public class ParameterImmutability{
    public static void main(String[] args){
        int i = 5;
        int j = 10;
        System.out.println("Before calling the swap method: "
            + "j = " + j + " and i = " + i);
        swap(i, j);
        System.out.println("After calling the swap method: "
            + "j = " + j + " and i = " + i);
    }

    private static void swap(int i, int j){
        int temp = j;
        j = i;
        i = temp;
        System.out.println("Inside the swap method:  "
            + "j = " + j + " and i = " + i);
    }
}
