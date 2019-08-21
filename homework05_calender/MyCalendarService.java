package homework05_calender;

public class MyCalendarService {
	public String getEndDay(MyCalendar mc) {
		String endDay = "";
		int month = Integer.parseInt(mc.getMonth());
		switch(month){
		case 2: endDay = "29일"; break;
		case 1: 
		case 3: 
		case 5: 
		case 7: 
		case 8: 
		case 10: 
		case 12: 
			endDay = "31일"; break;
			case 4:
			case 6:
			case 9:
			case 11:
			endDay = "30일"; break;
		}
		return endDay;
	}
	public String ifLeapYear(MyCalendar mc) {
		String leapYear = "윤년 입니다";
		int year = Integer.parseInt(mc.getYear());
		return leapYear;
	}
}
