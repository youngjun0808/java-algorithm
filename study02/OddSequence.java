package study02;
import java.util.Scanner;
public class OddSequence {
	public static void main(String[] args) {
		// 1 + 3 + 5 + 7 + 9 =
		// 1 % 2 = 0이면 짝수 1이면 홀수
		Scanner scan = new Scanner(System.in);
		String sequence = "";
		int series = 0;
		System.out.println("========================");
		System.out.println("입력된 시작값에서부터 마지막값까지 홀수의 합");
		System.out.println("========================");
		System.out.println("시작값: ");
		int start = scan.nextInt();
		System.out.println("마지막값: ");
		int end = scan.nextInt();
		for(int i=start; i<=end; i++) {
			if(i % 2 != 0) {
				int end2 = 0;
				if(end % 2 == 0) {
					end2 = end -1;
				} else {
					end2 = end;
				}
				if(i != end) {
					sequence += i + "+";
				}else {
					sequence += i + "=";
				}
				series += i;
			}
		}
		System.out.println(sequence + series);
	}
	
}
