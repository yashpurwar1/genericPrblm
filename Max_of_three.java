package maxOfThree;

public class Max_of_three {
	
	public static Float maximum(Float val1, Float val2, Float val3) {
		Float max = val1;
		if(val2.compareTo(max)>0) {
			max=val2;
		}else if(val3.compareTo(max)>0) {
			max=val3;
		}
		return max;
	}
	public static void main(String[] args) {
		Float val1=(float) 20.0, val2=(float) 40.0, val3=(float)30.0;
		System.out.println("Maximun number is "+maximum(val1,val2,val3));

	}

}
