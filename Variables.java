/*
Kenneth Adair
Following along with Java Fundamentals course on Pluralsight
This is a demo of variables
*/

public class Variables{
    public static void main(String[] args){
        int myVar = 50;
        myVar = 50;
        System.out.println(myVar);

        int anotherVar = 100;
        System.out.println(anotherVar);
        myVar = anotherVar;
        System.out.println(myVar);

        anotherVar = 200;
        System.out.println(anotherVar);

        System.out.println(myVar);
    }
}
