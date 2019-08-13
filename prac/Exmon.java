package prac;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Exmon {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		int flag = 0;
		String eval = "";
		switch(flag) {
		case 1: eval = "1월입니다."; break;
		case 2: eval = "2월입니다."; break;
		case 3: eval = "3월입니다."; break;
		case 4: eval = "4월입니다."; break;
		case 5: eval = "5월입니다."; break;
		case 6: eval = "6월입니다."; break;
		case 7: eval = "7월입니다."; break;
		case 8: eval = "8월입니다."; break;
		case 9: eval = "9월입니다."; break;
		case 10: eval = "10월입니다."; break;
		case 11: eval = "11월입니다."; break;
		case 12: eval = "12월입니다."; break;
		default: eval = "오류입니다."; break;
		}
		System.out.println(eval);
	}

}
