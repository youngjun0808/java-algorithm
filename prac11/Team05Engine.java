package prac11;
import javax.swing.JOptionPane;

public class Team05Engine {
	public static void main(String[] args) {
		Team05Member tm = null;
		Team05Service service = new Team05Service();
		System.out.println("0.종료, 1.join, 2.BMI, 3.ReportCard, 4.Tax");
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료, 1.join, 2.BMI, 3.ReportCard, 4.Tax")) {
			case "0": System.out.println("시스템 종료"); return;
			case "1":
				tm = new Team05Member();
				String id = JOptionPane.showInputDialog("ID입력");
				
				tm.setId(JOptionPane.showInputDialog("ID입력"));
				System.out.println("회원가입");
				System.out.println("아이디");
				//member.setId(scanner.next());
				System.out.println("비밀번호");
				//member.setPw(scanner.next());
				System.out.println("이름");
				//member.setName(scanner.next());
				System.out.println("주민번호");
				//member.setSsn(scanner.next());
				System.out.println("혈액형");
				//member.setBlood(scanner.next());
				System.out.println("키");
				//member.setHeight(scanner.nextDouble());
				System.out.println("몸무게");
				//member.setWeight(scanner.nextDouble());
				System.out.println("국어점수");
				//member.setKor(scanner.nextInt());
				System.out.println("영어점수");
				//member.setEng(scanner.nextInt());
				System.out.println("수학점수");
				//member.setMath(scanner.nextInt());
				System.out.println("연봉");
				//member.setIncome(scanner.nextInt());
				
				break;
			case "2":
				System.out.println("BMI");
				System.out.println(service.getReport(tm));
				break;
			case "3":
				System.out.println("ReportCard");
				System.out.println(service.getReport(tm));
				break;
			case "4":
				System.out.println("ReportCard");
				System.out.println(service.getReport(tm));
				break;
			}
		}
	}
}
