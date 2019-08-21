package prac11;

public class Team05Service {
	public String getBmi(Team05Member member) {
		String result = "";
		String name = member.getName();
		double height = member.getHeight();
		double weight = member.getWeight();
		double height2 = height / 100;
		double bmi = weight / (height2 * height2);
		if(30.0 < bmi) {
			result = "고도비만";
		}else if(25.0 < bmi) {
			result = "비만";
		}else if(23.0 < bmi) {
			result = "과체중";
		}else if(18.5 < bmi) {
			result = "정상";
		}else {
			result = "저체중";
		}
			result = String.format("%s님의, 키: %d.1f, 몸무게: %.1f 로 %.1f입니다.", name, height, weight, result);
			return result;
	}
	
	
	public String getReport(Team05Member member) {
		String result = "";
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		int sum = kor + eng + math;
		int ave = sum/3;
		String pass = "";
		if(ave >= 90) {
			pass = "장학생";
		}else if(ave >= 70) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		result = String.format("이름: %s"
				+ "국어 :%d"
				+ "영어:%d"
				+ "수학 :%d"
				+ "총점 :%d"
				+ "평균 :%d"
				+ "합격여부 :%s", member.getName(),kor,eng,math,sum,ave,pass);
				
				
		return result;
	}
	public String getTax(Team05Member member) {
		String result = "";
		String name = member.getName();
		int income = member.getIncome();
		double taxRate = 0.097;
		double tax = income*taxRate;
		result = String.format("연봉 %d만원 받으시는 %s 님의 나부하실 세금은 %.1f 입니다.", income, name, tax);
		
		return result;
	}
	
	
}
