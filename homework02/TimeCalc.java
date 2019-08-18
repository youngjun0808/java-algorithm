package homework02;
import java.util.Scanner;

public class TimeCalc {
	/*To.개발자님께
	초단위로 알려주는 시험이 있는데
	이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
	혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
	그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int input = 0;
			System.out.println("계산할 초값을 입력해주세요. (단위:초)");
			input = scan.nextInt();
			int hour = input / 3600;
			int minute = input / 60 - hour * 60;
			int second = input % 60;
			System.out.printf("%d시간, %d분, %d초 입니다.\n", hour, minute, second);
			
		}
	}
}
