package demo;

public class demo {
	public static void main(String[] args) {
		int odd[] = new int[50];
		int even[] = new int[50];

		int e = 0;
		int o = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				even[e] = i;
				e++;
			} else {
				odd[o] = i;
				o++;
			}

		}

		System.out.println("even nos are");
		showArray(even);
		System.out.println("odd nos are");
		showArray(odd);
	}

	public static void showArray(int array[]) {
		for (int t : array) {
			System.out.println(t);
		}
	}

}
