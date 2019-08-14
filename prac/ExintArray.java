package prac;

import java.util.Scanner;

public class ExintArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] subjects = {"국어","영어","수학","과학","사회"};
		for(;;) {}
		System.out.printf(" %s 점수를  5개 입력하세요\n", subjects[0]);
		int kor = scan.nextInt();
		System.out.printf(" %s 점수를  5개 입력하세요\n", subjects[1]);
		int eng = scan.nextInt();
		System.out.printf(" %s 점수를  5개 입력하세요\n", subjects[2]);
		int math = scan.nextInt();
		System.out.printf(" %s 점수를  5개 입력하세요\n", subjects[3]);
		int science = scan.nextInt();
		System.out.printf(" %s 점수를  5개 입력하세요\n", subjects[4]);
		int society = scan.nextInt();
		int[] scores = {kor, eng, math, science, society};
		System.out.printf("점수 %d \n", scores[0]);
		System.out.printf("점수 %d \n", scores[1]);
		System.out.printf("점수 %d \n", scores[2]);
		System.out.printf("점수 %d \n", scores[3]);
		System.out.printf("점수 %d \n", scores[4]);
	}
}
