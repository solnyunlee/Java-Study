package Day3;

import java.util.Scanner;

public class BJ2739 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, i;
		n = scanner.nextInt();
		scanner.close();
		for(i=1;i<=9;i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}

	}

}
