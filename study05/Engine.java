package study05;
import java.util.Scanner;
import java.sql.ResultSet;
import study05.Member;

public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		
		while(true) {
			System.out.println("0.종료 1.회원가입 2.정보보기 3.아이디찾기");
			switch(scan.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1:
				member = new Member();
				
				System.out.println("=== 회원가입 ===");
				System.out.print("아이디: ");
				member.setId(scan.next());
				
				System.out.print("비밀번호: ");
				member.setPw(scan.next());
				
				System.out.print("이름: ");
				member.setName(scan.next());

				System.out.print("생년월일: (형식에 맞게 입력해주세요. 예) 1980-01-01)");
				member.setBlood(scan.next());
				
				String birth = scan.next();
				
				System.out.print("키: (소수점 첫째자리까지, 숫자만 입력하세요.)");
				member.setHeight(scan.nextDouble());

				System.out.print("몸무게: (소수점 첫째자리까지, 숫자만 입력하세요.)");
				member.setWeight(scan.nextDouble());

				System.out.print("혈액형: (영어 1글자만 입력하세요.)");
				member.setBlood(scan.next());
				
				System.out.println("국어점수");
				member.setKor(scan.nextInt());
				break;
				
			case 2:
				System.out.println(member.toString());
				break;
				
			case 3:
				System.out.println("이름을 입력하면 아이디 알려줌");
				String searchName = scan.next();
				String searchId = scan.next();
				if(searchName.contentEquals("a") &&
						searchId.contentEquals("a")) {
					System.out.printf("찾는 아이디 : %s \n"
							+ "주민번호: %s \n",member.getId(), member.getSsn());
				}else {
					System.out.println("찾는 아이디가 없습니다.");
				}
			case 4:
				System.out.println("BMI 구하기");
				service.getBmi(member);
				break;
			}
		}
	}
}
