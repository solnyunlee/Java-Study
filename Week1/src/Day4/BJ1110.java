package Day4;

import java.util.Scanner;

public class BJ1110 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int originN, tempN, newN, countCycle = 0;
		originN = n;
		do {
			tempN = n/10 + n%10;
			newN = (n%10)*10 + tempN%10;
			n = newN;
			countCycle++;
		} while(originN!=newN);
		
		System.out.println(countCycle);
		scanner.close();

	}

}
