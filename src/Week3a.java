
public class Week3a {

	public static void main(String[] args) {
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

		int[] ages = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 100;

		int difference = ages[ages.length - 1] - ages[0];
		System.out.println("The value of the first element subtracted from the last element is " + difference);

		int total = 0;
		for (int i = 0; i < ages.length; i++) {
			total += ages[i];
		}

		int average = total / ages.length;
		System.out.println("The average of all the elements is  " + average);

//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		double averageLettersPerName = sumOfLetters / names.length;
		System.out.printf("The average number of letters per name is  %.2f", averageLettersPerName);
		System.out.println("");
		String concatenatedString = "";
		for (String name : names) {
			concatenatedString += name += " ";
		}

		System.out.println(concatenatedString);

		// 5. Create a new array of int called nameLengths. Write a loop to iterate over
		// the previously created names array and add the length of each name to the
		// nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(nameLengths[0]);
		System.out.println(nameLengths[1]);
		System.out.println(nameLengths[2]);
		System.out.println(nameLengths[3]);
		System.out.println(nameLengths[4]);
		System.out.println(nameLengths[5]);
		// 6. Write a loop to iterate over the nameLengths array and calculate the sum
		// of all the elements in the array. Print the result to the console.
		int sumNameLength = 0;
		for (int nameLength : nameLengths) {
			sumNameLength += nameLength;
		}

		System.out.println(sumNameLength);

		// 8. Write a method that takes two Strings, firstName and lastName, and returns
		// a full name (the full name should be the first and the last name as a String
		// separated by a space).
		String firstName = "Britney";
		String lastName = "Hanna";
		String fullName = createfullName(firstName, lastName);
		System.out.println(fullName);
		System.out.println(multiplyWord("Howdy", 9));
		int[] nums = { 1, 5, 15, 200 };
		int maximum = 100;
		boolean isBigger = arrayBiggerThan(nums, maximum);
		System.out.println(isBigger);

		double[] listOfNumbers = { 1, 15, 16, 18 };
		System.out.println(calculateAverage(listOfNumbers));

	}

	public static String createfullName(String firstName, String lastName) {
		String fullName = firstName + "" + lastName;
		return fullName;
	}

	// 7. Write a method that takes a String, word, and an int, n, as arguments and
	// returns the word concatenated to itself n number of times. (i.e. if I pass in
	// “Hello” and 3, I would expect the method to return “HelloHelloHello”).

	public static String multiplyWord(String word, int n) {
		String multiplyWord = " ";
		for (int i = 0; i < n; i++) {
			multiplyWord += word;
		}
		return multiplyWord;
	}

//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

	private static boolean arrayBiggerThan(int[] nums, int maximum) {
		int total = 0;
		for (int num : nums) {
			total += num;
		}
		return total > maximum;

	}

	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

}
