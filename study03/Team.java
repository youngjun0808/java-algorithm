package study03;
import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		while(true) {
			System.out.println("0.종료 1.a 2.b 3.c 4.d");
			flag = scan.nextInt();
			switch(flag) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("a");
					System.out.println("얼마에요?");
					int val = scan.nextInt();
					System.out.printf("%d원 입니다.", val);
					System.out.println("몇 개 드릴까요?");
					int count = scan.nextInt();
					System.out.printf("%d개 주세요.", count);
					int eval = val * count;
					System.out.printf("총 금액은 %d입니다.", eval);
					System.out.printf("비싸요. 10% 깎아주세요.");
					double dis = eval - (eval*0.1);
					System.out.printf("그럼 %.0f원만 주세요. \n", dis);
					break;
			
			case 2: System.out.println("b");
					int fir = 0;
					int sec = 0;
					double result = 0;
					String symbol = "";
					System.out.println("첫번째 값을 입력하세요.");
					fir = scan.nextInt();
					System.out.println("두번째 값을 입력하세요.");
					sec = scan.nextInt();
					System.out.println("사칙연산(+, -, /, *)중 하나를 입력하세요.");
					symbol = scan.nextInt();
					switch(symbol) {
					case "+": result = fir+sec; break;
					case "+": result = fir+sec; break;
					case "+": result = fir+sec; break;
					case "+": result = fir+sec; break;
					}
					if(symbol.contentEquals("/")) {
						System.out.println("%d%s%d = %d[%d]", fir symbol,sec,result);
					}
					break;
			
			case 3: System.out.println("c");
					System.out.println("궁금하신 연도를 입력해주세요");
					int year = scan.nextInt();
					String eval1 = "";
					
					if(year%4==0) {
						eval1 = "윤년";
						if(year%100==0) {
							eval1 = "평년";
							if(year%400==0) {
								eval1 = "윤년";
								
							}
						}
					}
					System.out.println("입력하신 "+ year +"년은" eval1);
					else {
					break;
			case 4: System.out.println("d"); break;
			}
		}
	}

}
