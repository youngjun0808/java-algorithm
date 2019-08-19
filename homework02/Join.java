package homework02;
import java.util.Scanner;

public class Join {
	/*to. 개발자님
	여기는 비트헬스 입니다.
	입력받을 정보는 아래와 같습니다.
	값을 입력받은 후에 다시 입력받은 값을 그대로 보여주는
	프로그램을 보여주세요

	=== 회원가입 ===
	아이디 : 
	비밀번호 : 
	이름 : 
	생년월일(예) 1980-01-01 : 
	성인여부(성인true,미성년false) : 
	키(소수점 첫째자리까지) :
	몸무게(소수점 첫째자리까지) : 
	혈액형(A) : 

	입력이 종료되면 ...아래처럼 보이게 해주세요

	=== 회원정보 ===
	아이디 : hong
	비밀번호 : 1234
	이름 : 홍길동
	생년월일(예) 1990-05-05 : 
	성인여부(성인true,미성년false) : 성인
	키(소수점 첫째자리까지) : 178.5 cm
	몸무게(소수점 첫째자리까지) : 75kg
	혈액형(A) : B형
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String id, password, name, blood, birth, bd , jud = "";
			double height, weight = 0.0;
			
			System.out.println("=== 회원가입 ===");
			System.out.print("아이디: ");
			id = scan.next();
			System.out.print("비밀번호: ");
			password = scan.next();
			System.out.print("이름: ");
			name = scan.next();
			System.out.print("생년월일: (형식에 맞게 입력해주세요. 예) 1980-01-01)");
			birth = scan.next();
			System.out.print("키: (소수점 첫째자리까지, 숫자만 입력하세요.)");
			height = scan.nextDouble();
			System.out.print("몸무게: (소수점 첫째자리까지, 숫자만 입력하세요.)");
			weight = scan.nextDouble();
			System.out.print("혈액형: (영어 1글자만 입력하세요.)");
			blood = scan.next();
			System.out.println("");
			
			System.out.printf("아이디: %s \n", id);
			System.out.printf("아이디: %s \n", password);
			System.out.printf("이름: %s \n", name);
			System.out.printf("생년월일: %s \n", birth);
			bd = birth.substring(0, 4);
			int adult = Integer.parseInt(bd);
			if(adult <= 2000) {
				System.out.println("성인여부: 성인");
			}else {
				System.out.println("성인여부: 미성년");
			}
			System.out.printf("키: %.1fcm \n", height);
			System.out.printf("몸무게: %.1fkg \n", weight);
			System.out.printf("혈액형: %s형 \n", blood);
			System.out.println("");
		}
	}
}
