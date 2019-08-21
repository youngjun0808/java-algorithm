package homework05_grade;
import javax.swing.JOptionPane;


public class GradeController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade gr = new Grade();
		GradeService gs = new GradeService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.점수입력 2.점수확인")) {
			case "0":System.out.println("종료"); return;
			case "1":
				gr.setKor(JOptionPane.showInputDialog("국어점수"));
				gr.setEng(JOptionPane.showInputDialog("영어점수"));
				gr.setMath(JOptionPane.showInputDialog("수학점수"));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, gs.getGrade(gr));
				break;
			}
		}
	}

}
