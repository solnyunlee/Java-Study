package Day1;

import java.util.Scanner;

public class BJ2588 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		int first, second, third;
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		
		first = a*(b%10);
		second = a*(b%100/10);
		third = a*(b/100);
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(first+(second*10)+(third*100));

	}

}
