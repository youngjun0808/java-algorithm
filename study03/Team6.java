package study03;
import java.util.Scanner;

public class Team6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		while(true) {
			System.out.println("0.종료 1.a 2.b 3.c");
			
			switch(flag) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("1.a");
			break;
			case 2: System.out.println("2.b");
			break;
			case 3: System.out.println("3.c");
			System.out.println("얼마에요?");
			int price = scan.nextInt();
			System.out.println("몇개 드릴까요?");
			int ea = scan.nextInt();
			System.out.printf("%d개 주세요", ea);
			int total = ea * price;
			System.out.printf("총 금액은 %d입니다.", total);
			System.out.println("그럼 %d원만 주세요");
			int dc = total / 10;
			total = total - dc;
			System.out.printf("그럼 %d원만 주세요\n", total);
			break;
			
			case 4: System.out.println("4.d");
			System.out.println("이름을 입력하세요");
			break;
			}
			
		}
		
	}
}
