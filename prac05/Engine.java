package prac05;
import java.util.Scanner;
import java.sql.ResultSet;
import prac05.Student;

public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		
		int flag = 0, resultInt = 0;
		String result = "";
		while(true) {
			System.out.println("0.종료 1.A 2.B 3.C 4.D");
			flag = scan.nextInt();
			switch(flag) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("A");
			System.out.println("공백 입력");
			= scan.next();
			result = student.getXXX(a, b, c);
			System.out.println(result);
			break;
			
			
			
			
			
			
			
			
			case 2: System.out.println("B");
			System.out.println("공백 입력");
			= scan.next();
			result = student.getXXX(a, b, c);
			System.out.println(result);
			break;
			
			
			
			
			
			
			
			
			case 3: System.out.println("C");
			System.out.println("공백 입력");
			= scan.next();
			result = student.getXXX(a, b, c);
			System.out.println(result);
			break;
			
			
			
			
			
			
			
			
			case 4: System.out.println("D");
			System.out.println("공백 입력");
			= scan.next();
			result = student.getXXX(a, b, c);
			System.out.println(result);
			break;
			
			
			
			
			
			
			
			
			}
		}
	}
}
