package demo;

public class demo {
	public static void main(String[] args) {

		int oddarray[] = new int[50];
		int evenarray[] = new int[50];

		int evencount = 0;
		int oddcount = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenarray[evencount] = i;
				evencount++;
			} else {
				oddarray[oddcount] = i;
				oddcount++;
			}

		}

		System.out.println("even nos are");
		showArray(evenarray);
		System.out.println("odd nos are");
		showArray(oddarray);
	}

	public static void showArray(int array[]) {
		for (int temp : array) {
			System.out.println(temp);
		}
	}

}
