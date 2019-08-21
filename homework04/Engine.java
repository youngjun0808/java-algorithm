package homework04;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		while(true) {
			System.out.println("0.종료 1.회원가입 2.정보보기 3.아이디찾기 4.BMI 5.Tax 6.ReportCard");
			switch(scan.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1:
				member = new Member();
				System.out.println("회원가입");
				System.out.println("아이디");
				member.setId(scan.next());
				System.out.println("비밀번호");
				member.setPw(scan.next());
				System.out.println("이름");
				member.setName(scan.next());
				System.out.println("주민번호");
				member.setSsn(scan.next());
				System.out.println("키");
				member.setHeight(scan.nextDouble());
				System.out.println("몸무게");
				member.setWeight(scan.nextDouble());
				System.out.println("혈액형");
				member.setBlood(scan.next());
				break;
			case 2:
				System.out.println(member.toString());
				break;
			case 3:
				System.out.println("아이디, 이름을 입력하면 비번과 주민번호 알려줌");
				String searchName = scan.next();
				String searchId = scan.next();
				if(searchName.equals("a") &&
						searchId.equals("a")) {
					System.out.printf("찾는 아이디 : %s \n"
							+ "주민번호: %s \n",member.getId(), member.getSsn());
				}else {
					System.out.println("찾는 아이디가 없습니다.");
				}
				break;
			case 4:
				System.out.println("BMI 구하기");
				System.out.println("이름");
				String name = scan.next();
				System.out.println("몸무게");
				double weight = scan.nextDouble();
				System.out.println("키");
				double height= scan.nextDouble();
				Bmi b = new Bmi(name, weight, height);
				System.out.println("BMI는 "+b.result());
				break;
			case 5:
				System.out.println("Tax");
				System.out.println("이름");
				String nameTax = scan.next();
				System.out.println("연봉");
				double money = scan.nextDouble();
				System.out.println("세금");
				double per = scan.nextDouble();
				Tax t = new Tax(nameTax, money, per);
				System.out.println("세금은 "+t.result());
				break;
			case 6:
				break;
			}
		}
	}
}
