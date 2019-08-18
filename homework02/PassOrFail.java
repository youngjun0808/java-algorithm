package homework02;
import java.util.Scanner;

public class PassOrFail {
	/* To. 개발자님
     * 프로그램을 하나 개발해야 합니다.
     * 교수는 학생과 국어, 영어, 수학점수만 입력하면
     * 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
     * 오더는 다음과 같이 화면에 출력하라고 합니다.
     * 학생           국어        영어        수학        총점        평균        합격여부
     * =======================================================
     * 홍길동     90       90      90     270      90       (장학생)
     * 합격여부는 다음과 같다고 합니다.
     * 평균이 90점 이상이면 장학생
     * 70점 이상 90점미만 이면 합격
     * 70미만이면 불합격이라고 하네요.
     * 단) 평균에서 소수점이하는 절삭입니다.
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int sum = 0;
			double average = 0;
			String pass = "";
		
			System.out.println("학생의 이름을 입력해주세요.");
			String name = scan.next();
			System.out.println("학생의 점수를 입력해주세요.");
			String[] subjects = {"국어", "영어", "수학"};
			int[] scores = new int[3];
		
			for(int i=0; i < subjects.length; i++) {
				System.out.printf(" %s 점수를 입력하세요: ", subjects[i]);
				scores[i] = scan.nextInt();
			}
		
			for(int i=0; i< scores.length; i++) {
				sum += scores[i];
			}
			average = sum / (double)scores.length;
		
			if(average >= 90) {
				pass = "장학생";
			}else if(average >= 70) {
				pass = "합격";
			}else {
				pass = "불합격";
			}
		
			System.out.println("학생        국어        영어        수학        총점        평균        합격여부");
			System.out.println("=================================================");
			System.out.printf("%s   %d      %d      %d      %d    %.0f     (%s)\n", name, scores[0], scores[1], scores[2], sum, average, pass);
		}
	}
}
