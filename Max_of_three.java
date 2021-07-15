package maxOfThree;

public class Max_of_three<T extends Comparable <T>> {
	T val1, val2, val3;
	
	public Max_of_three(T val1, T val2, T val3) {
		this.val1=val1;
		this.val2=val2;
		this.val3=val3;
	}
	
	public T maximum (T val1, T val2, T val3) {
		T max = val1;
		if(val2.compareTo(max)>0) {
			max=val2;
		}else if(val3.compareTo(max)>0) {
			max=val3;
		}
		return max;
	}
	public static void main(String[] args) {
		Max_of_three obj = new Max_of_three("yash","Ankur","jatin");
		System.out.println("Maximun is "+obj.maximum(obj.val1, obj.val2, obj.val3));
	}

}
