package study07;
import javax.swing.JOptionPane;

public class MemberController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberBean mb = new MemberBean();
		MemberService mbs = new MemberService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.회원정보입력 2.회원정보확인")) {
			case "0":System.out.println("종료"); return;
			case "1":
				mb.setId(JOptionPane.showInputDialog("id 입력"));
				mb.setPw(JOptionPane.showInputDialog("패스워드 입력"));
				mb.setName(JOptionPane.showInputDialog("이름 입력"));
				mb.setSsn(JOptionPane.showInputDialog("주민번호 입력"));
				mb.setBlood(JOptionPane.showInputDialog("혈액형 입력"));
				mb.setWeight(JOptionPane.showInputDialog("몸무게 입력"));
				mb.setHeight(JOptionPane.showInputDialog("키 입력"));
				break;
			case "2":
				JOptionPane.showMessageDialog(null,  "2.마이페이지 \n"+mb.toString());
				break;
			}
		}
	}

}
