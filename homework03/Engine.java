package homework03;
import java.util.Scanner;
import java.sql.ResultSet;
import homework03.Student;

public class Engine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		// TODO Auto-generated method stub
		int flag = 0, resultInt = 0;
		String result = "", name = "";
		String[] recordResult = new String[3];
		String[] resultString = new String[8];
		
		while(true) {
			System.out.println("0.종료 1.Arith 2.BMI 3.HowMuch 4.Join 5.LeapYear 6.MonthEndDay 7.PassOrFail ");
			System.out.println("8.Ranking 9.ReportCard 10.Score 11.Tax 12.TimeCalc");
			flag = scan.nextInt();
			
			switch(flag) {
			case 0: System.out.println("종료"); return;
			
			case 1: System.out.println("Arith, 계산방법(1/2/3/4), 숫자1, 숫자2");
			System.out.println("원하시는 계산기의 숫자를 입력해주세요: 1.+(더하기), 2.-(빼기), 3.*(곱하기), 4./(나누기)");
			int num = scan.nextInt();
			System.out.print("1. 숫자를 입력해주세요: ");
			int n1 = scan.nextInt();
			System.out.print("2. 숫자를 입력해주세요: ");
			int n2 = scan.nextInt();
			result = student.getArith(num, n1, n2);
			System.out.println(result);
			
			result = student.getArith(num, n1, n2);
			System.out.println(result);
			break;
			
			
			
			case 2: System.out.println("BMI, 이름, 몸무게, 키");
			name = scan.next();
			Double weight = scan.nextDouble();
			Double height = scan.nextDouble();
			result = student.getBmi(name, weight, height);
			System.out.println(result);
			break;
			
			
			
			case 3: System.out.println("Arith, 계산방법(1/2/3/4), 숫자1, 숫자2");
			break;
			case 4: System.out.println("Arith, 계산방법(1/2/3/4), 숫자1, 숫자2");
			break;
			case 5: System.out.println("Arith, 계산방법(1/2/3/4), 숫자1, 숫자2");
			break;
			case 6: System.out.println("Arith, 계산방법(1/2/3/4), 숫자1, 숫자2");
			break;
			case 7: System.out.println("Arith, 계산방법(1/2/3/4), 숫자1, 숫자2");
			break;
			case 8: System.out.println("Arith, 계산방법(1/2/3/4), 숫자1, 숫자2");
			break;
			case 9: System.out.println("Arith, 계산방법(1/2/3/4), 숫자1, 숫자2");
			break;
			case 10: System.out.println("Arith, 계산방법(1/2/3/4), 숫자1, 숫자2");
			break;
			case 11: System.out.println("Arith, 계산방법(1/2/3/4), 숫자1, 숫자2");
			break;
			case 12: System.out.println("Arith, 계산방법(1/2/3/4), 숫자1, 숫자2");
			break;
			}
		}

	}

}
