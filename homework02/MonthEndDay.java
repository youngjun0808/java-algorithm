package homework02;
import java.util.Scanner;

public class MonthEndDay {
	/*To. 개발자님
	월을 입력하면 해당 월이 몇일까지인지
	알려주는 프로그램을 작성해 주세요.
	단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
	출력문장 : "??월은 **일 까지 입니다."
	*/
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			while(true) {
				Scanner scan = new Scanner(System.in);
				System.out.println("몇일까지인지 알고싶은 달을 입력해주세요.");
				int month = scan.nextInt();
				String day = "";
			
				switch(month) {
				case 2: 
					System.out.println("2월은 29일까지입니다."); break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.printf("%d월은 31일 까지 입니다. \n", month); break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.printf("%d월은 30일 까지 입니다. \n", month); break;
				default:
					System.out.println("잘못된 입력입니다. 숫자만 입력하시오."); break;
			}
		}
	}
}
