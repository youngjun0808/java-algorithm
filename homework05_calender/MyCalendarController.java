package homework05_calender;
import javax.swing.JOptionPane;

public class MyCalendarController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalendar mc = new MyCalendar();
		MyCalendarService mcs = new MyCalendarService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.달력몇일까지 2.윤년확인")) {
			case "0":System.out.println("종료"); return;
			case "1":
				mc.setMonth(JOptionPane.showInputDialog("월"));
				JOptionPane.showMessageDialog(null, mcs.getEndDay(mc));
				break;
			case "2":
				break;
			}
		}
	}

}
