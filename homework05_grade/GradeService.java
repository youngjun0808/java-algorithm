package homework05_grade;

public class GradeService {
	public String getGrade(Grade gr) {
	String result = "";
	int kor = Integer.parseInt(gr.getKor());
	int eng = Integer.parseInt(gr.getEng());
	int math = Integer.parseInt(gr.getMath());
	double sum = kor + eng + math;
	double avg = sum / 3;
	
	result = String.format("국어점수: %s \t"
			+ "영어점수: %s \t"
			+ "수학점수: %s \t"
			+ "총합: %s \t"
			+ "평균: %s \t", kor, eng, math, sum, avg);
	
	return result;
	}
}
