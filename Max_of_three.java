package maxOfThree;

import java.util.Arrays;

public class Max_of_three<T extends Comparable <T>> {
	T[] valueArray;
	
	public Max_of_three(T[] valueArray) {
		this.valueArray= valueArray;
	}
	
	public T maximum (T[] valueArray) {
		Arrays.sort(valueArray);
		int len = valueArray.length;
		T max = valueArray[len-1];
		return max;
	}
	public static void main(String[] args) {
		Comparable[] intArray = {1,5,8,6};
		Max_of_three test1 = new Max_of_three(intArray);
		System.out.println("Maximun is "+test1.maximum(intArray));
		Comparable[] stringArray = {"yash", "ankur", "saket"};
		Max_of_three test2 = new Max_of_three(stringArray);
		System.out.println("Maximun is "+test2.maximum(stringArray));
	}

}
