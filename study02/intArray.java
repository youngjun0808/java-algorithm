package study02;
import java.util.Scanner;

public class intArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] subjects = {"국어","영어","수학","과학","사회"};
		int[] scores = new int[5];
		for(int i=0; i < subjects.length; i++ ) {
			System.out.printf(" %s 점수를  5개 입력하세요\n", subjects[i]);
			scores[i] = scan.nextInt();
		}
		for(int i=0; i < scores.length; i++) {
			System.out.printf("%s 점수 %d \n",subjects[i], scores[i]);
		}
	}
}
