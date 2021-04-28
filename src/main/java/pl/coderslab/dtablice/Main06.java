package pl.coderslab.dtablice;

public class Main06 {

	public static void main(String[] args) {
		int[] numbers = {4, 643, 112, 9999, -69};
		for (int i = numbers.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(numbers[i]);
			} else {
				System.out.println(numbers[i]);
			}
		}
	}

}