package oddeventest;

public class OddEvenTest {
	public static void main(String[] args) {

		int oddarray[] = new int[50];
		int evenarray[] = new int[50];

		int evencount = 0;
		int oddcount = 0;

		for (int count = 1; count <= 100; count++) {

			if (count % 2 == 0) {
				evenarray[evencount] = count;
				evencount++;
			} else {
				oddarray[oddcount] = count;
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
