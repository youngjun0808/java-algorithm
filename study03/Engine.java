package study03;
import java.util.Scanner;
import study03.Student;

public class Engine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		// TODO Auto-generated method stub
		int flag = 0;
		while (true) {
			System.out.println("메뉴: 0.종료 1.BMI 2.Ranking 3.HowMuch 4.ReportCard");
			flag = scan.nextInt();

			switch (flag) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("BMI");
				String name = "";
				double weight = 0.0, height = 0.0;
				System.out.println("이름을 입력해주세요.");
				name = scan.next();
				System.out.println("몸무게를 입력해주세요.");
				weight = scan.nextDouble();
				System.out.println("키를 입력해주세요. (m단위, 예: 182cm, 1.82)");
				height = scan.nextDouble();
				String result = student.getBmi(name, weight, height);
				System.out.println(result);
				break;
			case 2:
				System.out.println("Ranking");
				student.getRank();
				break;
			case 3:
				System.out.println("HowMuch");
				student.howMuch();
				break;
			case 4:
				System.out.println("ReportCard");
				student.getReportCard();
				break;
			}
		}
	}

}
