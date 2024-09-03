package justlearn;

import java.util.Arrays;

public class sum_of_digit {

	public static void main(String[] args) {
		
		int number = 1547;
        int sum = sumOfOrderedDigits(number);
        System.out.println("The sum of ordered digits is: " + sum);
    }

    public static int sumOfOrderedDigits(int number) {
        // Convert the number to a string
        String numberStr = Integer.toString(number);

        // Convert the string to a character array and sort it
        char[] digitsArray = numberStr.toCharArray();
        Arrays.sort(digitsArray);

        // Calculate the sum of the digits
        int sum = 0;
        for (char digit : digitsArray) {
            sum += Character.getNumericValue(digit);
        }

        return sum;
	}

}
