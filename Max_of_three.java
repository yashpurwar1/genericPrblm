package maxOfThree;

import java.util.Arrays;

public class Max_of_three<T extends Comparable <T>> {
	T[] valueArray;
	
	public Max_of_three(T[] valueArray) {
		this.valueArray= valueArray;
	}
	
	public void maximum (T[] valueArray) {
		Arrays.sort(valueArray);
		int len = valueArray.length;
		T max = valueArray[len-1];
		printMax(max);
	}
	
	public void printMax(T max) {
		System.out.println("Maximum is "+max);
	}
	
	public static void main(String[] args) {
		Comparable[] intArray = {1,5,8,6};
		
		Max_of_three test1 = new Max_of_three(intArray);
		
		test1.maximum(intArray);
		
		Comparable[] stringArray = {"yash", "ankur", "saket"};
		
		Max_of_three test2 = new Max_of_three(stringArray);
		
		test2.maximum(stringArray);
	}

}
