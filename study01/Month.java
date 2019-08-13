package study01;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Random;

public class Month {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String now = sdf.format(date);
		//String.format(" %s ", "안녕 ");
		System.out.println(now);
		
		// TODO Auto-generated method stub
		int imonth = Integer.parseInt(now.substring(6,7));
		String eval = "";
		
		//String s = String.valueOf(i);
		//int -> String(결과)
		
		//int i = Integer.parseInt(s);
		//String -> int(결과)
		
		System.out.println("숫자를 입력해주세요.");
		
		switch(imonth) {
		case 1: eval = "1월"; break;
		case 2: eval = "2월"; break;
		case 3: eval = "3월"; break;
		case 4: eval = "4월"; break;
		case 5: eval = "5월"; break;
		case 6: eval = "6월"; break;
		case 7: eval = "7월"; break;
		case 8: eval = "8월"; break;
		case 9: eval = "9월"; break;
		case 10: eval = "10월"; break;
		case 11: eval = "11월"; break;
		case 12: eval = "12월"; break;
		default: eval = "Invalid month"; break;
		}
		System.out.println(eval);
	}

}
