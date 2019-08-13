package prac;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ExMonth {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String now = sdf.format(date);
		//String.format(" %s ", "안녕 ");
		System.out.println(now);
		
		// TODO Auto-generated method stub
		int imonth = Integer.parseInt(now.substring(6,7));
		System.out.println(imonth);
		String eval = "";
	}
}
