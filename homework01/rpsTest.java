package homework01;
import java.util.Scanner;
import java.util.Random;

public class rpsTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("가위바위보 한판 승부! 1.가위 2.바위 3.보 ");
			Random ran = new Random();
			int com = 0;
			com = ran.nextInt(3)+1;
			System.out.println(com);
			
		}
    }
}
