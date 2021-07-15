package maxOfThree;

public class Max_of_three {
	
	public static String maximum(String val1, String val2, String val3) {
		String max = val1;
		if(val2.compareTo(max)>0) {
			max=val2;
		}else if(val3.compareTo(max)>0) {
			max=val3;
		}
		return max;
	}
	public static void main(String[] args) {
		String val1="Banana", val2= "Peach", val3="Apple";
		System.out.println("Maximun is "+maximum(val1,val2,val3));

	}

}
