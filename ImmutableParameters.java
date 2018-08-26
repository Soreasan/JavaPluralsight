import java.util.*;

public class ImmutableParameters{

	public static void main(String[] args){
		System.out.println("Hello World!");
		int i = 10;
		int j = 20;
		System.out.println("Before calling the swap method j = " + j + " and i = " + i);
		swap(i, j);
		System.out.println("After calling the swap method j = " + j + " and i = " + i);
		System.out.println("This is because parameters are immutable.  The variables we pass into a method are passed by value rather than reference");
	}
	

	private static void swap(int i, int j){
		int temp = j;
		j = i;
		i = temp;
		System.out.println("Within the method j = " + j + " and i = " + i);
	}
}	
