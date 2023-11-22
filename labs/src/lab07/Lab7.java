package lab07;

public class Lab7 {
	public void start() {
		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
		int sum = Sum(numbers);
		System.out.println("Sum = " + sum);
		float avg = Average(numbers);
		System.out.println("Average = " + avg);
		int min = Minimum(numbers);
		System.out.println("Minimum = " + min);
		int max = Maximum(numbers);
		System.out.println("Maximum = " + max);
		int indexOfZero = FindFirstZero(numbers);
		System.out.println("Zero = " + indexOfZero);
	}

	private int FindFirstZero(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	private int Maximum(int[] numbers) {
		int max = numbers[0];
		for(int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		return max;
	}

	private int Minimum(int[] numbers) {
		int min = numbers[0];
		for(int number : numbers) {
			if (number < min) {
				min = number;
			}
		}
		return min;
	}

	private float Average(int[] numbers) {
		int sum = Sum(numbers);
		return (float) sum / numbers.length;
	}

	private int Sum(int[] numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
