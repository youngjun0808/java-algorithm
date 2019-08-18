package homework02;
import java.util.Scanner;

public class ArithmeticCalculator {
	/*To. 개발자님
	프로그램을 하나 개발해야 합니다.
	교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
	복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
	몫과 나머지값으로 출력하면 된답니다.
	출력결과물은 예를 들어
	5 + 5 = 10
	2 - 7 = -5
	이렇게 되고,
	10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
	그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
	*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int num, n1, n2 = 0;
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

		}
	}
}
