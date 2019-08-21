package study03;
import java.util.Scanner;

public class Student {
// 1.BMI 2.Ranking 3.HowMuch 4.ReportCard
	
	public String getBmi(String name, double weight, double height) {
		double bmi = weight / (height * height);
		if (bmi > 30.0) {
			System.out.println("고도비만");
		}else if(bmi > 25.0) {
			System.out.println("비만");
		}else if(bmi > 23.0) {
			System.out.println("과체중");
		}else if(bmi > 18.5) {
			System.out.println("정상");
		}else {
			System.out.println("저체중");
		}
		//return String.format("
		System.out.printf("%s님의 BMI수치는 %.1f입니다.\n", name, bmi);
		return name;
	}
	
	public void getRank() {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		double[] second = new double[3];
		int[] rank = new int[3];
	
		for(int i=0; i<3; i++) {
			rank[i] = 1;
		}
	
		for(int i=0; i<3; i++) {
			System.out.print("선수" + (i+1) + "번의 기록: ");
			second[i] = scan.nextDouble();
		}
	
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(second[i] > second[j])
					rank[i] = rank[i] + 1;
			}
		}
		
		System.out.println("###### 성적 랭킹 ######");
		for(int i=0; i<3; i++) {
			System.out.println(rank[i] + "등: " + (i+1) + "번 선수의 기록" + " (" + second[i] + ")");
		}
		System.out.println("");
	}
	public void howMuch() {
		Scanner scan = new Scanner(System.in);
		int price, amount, total, dc = 0;
		System.out.println("얼마에요?");
		price = scan.nextInt();
		System.out.printf("%d원 입니다.\n", price);
		System.out.println("몇개 드릴까요?\n");
		amount = scan.nextInt();
		total = price * amount;
		System.out.printf("%d개 주세요.\n", amount);
		dc = total / 10;
		System.out.printf("총 금액은 %d원 입니다.\n", total);
		int total2 = total - dc;
		System.out.print("10%할인해서 결제하실 금액은 ");
		System.out.printf("%d원 입니다.\n", total2);
	}
	
	public void getReportCard() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		double average = 0;
		String pass = "";
	
		System.out.println("학생의 이름을 입력해주세요.");
		String name = scan.next();
		System.out.println("학생의 점수를 입력해주세요.");
		String[] subjects = {"국어", "영어", "수학"};
		int[] scores = new int[3];
	
		for(int i=0; i < subjects.length; i++) {
			System.out.printf(" %s 점수를 입력하세요: ", subjects[i]);
			scores[i] = scan.nextInt();
		}
	
		for(int i=0; i< scores.length; i++) {
			sum += scores[i];
		}
		average = Math.floor(sum / (double)scores.length);
	
		if(average >= 90) {
			pass = "장학생";
		}else if(average >= 70) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
	
		System.out.println("학생        국어        영어        수학        총점        평균        합격여부");
		System.out.println("=================================================");
		System.out.printf("%s   %d      %d      %d      %d    %.0f     (%s)\n", name, scores[0], scores[1], scores[2], sum, average, pass);
	
	}
	
}
