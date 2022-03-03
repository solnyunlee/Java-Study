package Day3;

import java.util.Scanner;

public class BJ10950 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t, a, b;
		int i = 1;
		t = scanner.nextInt();
		while (i<=t) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.println(a+b);
			i++;
		}
		scanner.close();
	}

}
