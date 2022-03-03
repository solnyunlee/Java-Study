package Day2;

import java.util.Scanner;

public class BJ2884 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h, m;
		h = scanner.nextInt();
		m = scanner.nextInt();
		scanner.close();
		m = m - 45;
		if(m < 0) {
			m = m + 60;
			h = h - 1;
			if (h < 0) {
				h = h + 24;
			}
		}
		System.out.println(h + " " + m);

	}

}
