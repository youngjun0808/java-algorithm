package prac;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ExMonth {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String day = sdf.format(date);
		System.out.println(day);
	}
}
