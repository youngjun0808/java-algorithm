package prac06;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member mb = new Member();
		Service sv= new Service();
		int flag = 0;
		
		while(true) {
			System.out.println("0.종료 1.회원정보 2.Bmi 3.Join 4.ReportCard 5.");
			switch(flag) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("회원정보");
			System.out.println("이름");
			
			break;
			case 2: System.out.println("Bmi");
			break;
			case 3: System.out.println("Join");
			break;
			case 4: System.out.println("ReportCard");
			break;
			}
		}
	}
}
