
public class Question11BooleanMethod {

	public static void main(String[] args) {
		double[] array1 = { 100.5, 50, 3 };
		double[] array2 = { 2.0 };
		boolean array1GreaterThan = avgTwoArrays(array1, array2);
		System.out.println(array1GreaterThan);
	}

	public static double average(double[] numbers) {
		double total = 0.0;
		for (int index = 0; index < numbers.length; index++) {
			total += numbers[index];
		}
		return total / numbers.length;

	}

	public static boolean avgTwoArrays(double[] array1, double[] array2) {
		double avg1 = average(array1);
		double avg2 = average(array2);
		return avg1 > avg2;
	}

}