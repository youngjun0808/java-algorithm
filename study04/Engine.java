package study04;
import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("0.종료 1.BMI 2.이해못할문제");
			switch(scan.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("BMI, 이름, 키, 몸무게 입력");
			String name = scan.next();
			double height = scan.nextDouble();
			double weight = scan.nextDouble();
			String result = student.getBmi(name,height,weight);
			break;
			
			// 이름, 주소, 나이, 은행잔고, 신용도
			// 결과가 뭘 넣든간에 1억 대출
			case 2: System.out.println("이름, 주소, 나이, 은행잔고, 신용도");
			name = scan.next();
			String adress = scan.next();
			int age = scan.nextInt();
			int money = scan.nextInt();
			int credit = scan.nextInt();
			result = student.getLoan(name, adress, age, money, credit);
			System.out.println(result);
				break;
			}
		}

	}

}
