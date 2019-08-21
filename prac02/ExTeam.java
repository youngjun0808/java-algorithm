package prac02;
import java.util.Scanner;

public class ExTeam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		
		while(true) {
			System.out.println("0.종료 1.a 2.b 3.c 4.d");
			flag = scan.nextInt();
			
			switch(flag) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("1.a");
			break;
			case 2: System.out.println("2.a");
			break;
			case 3: System.out.println("3.a");
			break;
			case 4: System.out.println("4.a");
			break;
			}
		}
		
	}
}