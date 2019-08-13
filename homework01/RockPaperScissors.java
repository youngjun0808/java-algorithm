package homework01;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("가위바위보 한판 승부! 1.가위 2.바위 3.보 ");
			Random ran = new Random();
			int com = 0;
			com = ran.nextInt(3)+1;

			System.out.println(com);
			if(com == 1){
				System.out.println("1.가위");
			}else if(com == 2){
				System.out.println("2.바위");
			}else {
				System.out.println("3.보");
			}

			int p = 0;
			p = scan.nextInt();
			if(com == p){
				System.out.print(com);
				System.out.println("비겼습니다.");
			}else if(com == 1){
				com = com + 1;
				if(com < p){
					System.out.println("YOU Lose");
				}else {
					System.out.println("You Win");
				}
			}else if(com == 2){
				if(com < p){
					System.out.println("You Win");
				}else {
					System.out.println("You Lose");
				}
			}else if(com == 3){
				com = com - 1;
				if(com > p){
					System.out.println("You Win");
				}else {
					System.out.println("You Lose");
				}
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
    }
}
