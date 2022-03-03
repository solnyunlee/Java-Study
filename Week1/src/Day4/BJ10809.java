package Day4;

import java.util.Scanner;

public class BJ10809 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int [26];
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
		String S = scanner.nextLine();
		scanner.close();
		for(int i=0;i<S.length();i++) {
			char ch = S.charAt(i);
			if(arr[ch-'a']==-1) {
				arr[ch-'a']=i;
			}
		}
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}

}
