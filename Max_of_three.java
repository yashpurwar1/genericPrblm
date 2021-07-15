package maxOfThree;

public class Max_of_three {
	
	public static Integer maximum(Integer val1, Integer val2, Integer val3) {
		int max= val1;
		if(val2.compareTo(max)>0) {
			max=val2;
		}else if(val3.compareTo(max)>0) {
			max=val3;
		}
		return max;
	}
	public static void main(String[] args) {
		Integer val1=20, val2=40, val3=30;
		System.out.println("Maximun number is "+maximum(val1,val2,val3));

	}

}
