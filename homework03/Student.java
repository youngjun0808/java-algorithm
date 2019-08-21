package homework03;
import java.util.Scanner;

public class Student {
	Scanner scan = new Scanner(System.in);
	public String getArith(int num, int n1, int n2) {
		String result = "";
		
		System.out.println("원하시는 계산기의 숫자를 입력해주세요: 1.+(더하기), 2.-(빼기), 3.*(곱하기), 4./(나누기)");
		num = scan.nextInt();
		System.out.print("1. 숫자를 입력해주세요: ");
		n1 = scan.nextInt();
		System.out.print("2. 숫자를 입력해주세요: ");
		n2 = scan.nextInt();
		
		int sum = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int div = n1 / n2;
		int div2 = n1 % n2;
		
		switch(num) {
		case 1: System.out.println(sum); break;
		case 2: System.out.println(sub); break;
		case 3: System.out.println(mul); break;
		case 4: System.out.println(div + " ["+ div2 + "]"); break;
		default: System.out.println("계산방법을 잘못 선택하셨습니다. 원하시는 기능의 숫자만 입력해주세요.");
		}
		return result;
	}
	
	public String getBmi(String name, Double weight, Double height) {
		String result = "";
		return result;
	}

}
