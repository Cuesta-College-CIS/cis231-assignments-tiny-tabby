import java.util.Scanner;

public class Lab519_2 {
	public static void main(String[] args) {
		int length = 5;
		int[] numbers = { 5, 20, 30, 35, 50, 0, 0, 0, 0, 0 };
		int insert_value;

		Scanner scnr = new Scanner(System.in);
		insert_value = scnr.nextInt();

		// where is value between?
		int i = 0;
		// - - - - - - - - - - - - - - - - - - - -
		// while( insert_value > numbers[i] ){
		// Add one condition to check the length
		while ((i < length) && (insert_value > numbers[i])) {
			i++;
		}
		i--;// index value of min
			// i and everything before it do not need to move
			// - - - - - - - - - - - - - - - - - - - -
			// Do not use integer literal directly. This makes the code run only with the
			// fixed value set.
			// for (int j = 4; j > i; j--) {
		for (int j = length - 1; j > i; j--) {
			numbers[j + 1] = numbers[j];
		}
		numbers[i + 1] = insert_value;

		for (int in = 0; in < length + 1; in++) {
			System.out.print(numbers[in] + " ");
		}
		System.out.println();
		scnr.close();
	}

}

