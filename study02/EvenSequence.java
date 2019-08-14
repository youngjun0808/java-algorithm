package study02;
import java.util.Scanner;

public class EvenSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sequence = "";
		int series = 0;
		System.out.println("시작값");
		int start = 0;
		System.out.println("끝값");
		int end = scan.nextInt();
		for(int i=1;i<=10;i++) {
			if(i % 2 ==0) {
				if(i != 10) {
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
