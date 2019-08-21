package homework04;

public class Service {
	public String getBmi(Member member) {
		String result = "정상";
		String name = member.getName();
		double height = member.getHeight();
		double weight = member.getWeight();
		double bmi = weight / (height * height);
		if (bmi > 30.0) {
			result = "고도비만";
		}else if(bmi > 25.0) {
			result = "비만";
		}else if(bmi > 23.0) {
			result = "과체중";
		}else if(bmi > 18.5) {
			result = "정상";
		}else {
			result = "저체중";
		}
		
		return result;
	}
	public String getReportCard(Member member) {
		String result = "";
		return result;
	}
	public String getTax(Member member) {
		String result = "";
		return result;
	}
}
