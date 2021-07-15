package maxOfThree;

public class Max_of_three<T> {
	
	public static <T extends Comparable <T>> T maximum (T val1, T val2, T val3) {
		T max = val1;
		if(val2.compareTo(max)>0) {
			max=val2;
		}else if(val3.compareTo(max)>0) {
			max=val3;
		}
		return max;
	}
	public static void main(String[] args) {
		String val1="Banana", val2= "Peach", val3="Apple";
		Integer num1 =10, num2 =20, num3 =40;
		System.out.println("Maximun is "+maximum(val1,val2,val3));
		System.out.println("Maximun is "+maximum(num1, num2, num3));
	}

}
