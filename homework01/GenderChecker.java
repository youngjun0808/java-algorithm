package homework01;
import java.util.Scanner;

public class GenderChecker {
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true) {
        	System.out.println("주민번호를 입력해주세요");
        	String ssn = "";
        	ssn = scan.next();
        	System.out.println(ssn);
        	String num = ssn.substring(7,8);
        	System.out.println(num);
        	int ber = Integer.parseInt(num);
        	String exp = "";
        	
        	switch(ber) {
        	case 9: exp = "1800 ~ 1899년에 태어난 남성"; break;
        	case 0: exp = "1800 ~ 1899년에 태어난 여성"; break;
        	case 1: exp = "1900 ~ 1999년에 태어난 남성"; break;
        	case 2: exp = "1900 ~ 1999년에 태어난 여성"; break;
        	case 3: exp = "2000 ~ 2099년에 태어난 남성"; break;
        	case 4: exp = "2000 ~ 2099년에 태어난 여성"; break;
        	case 5: exp = "1900 ~ 1999년에 태어난 남성"; break;
        	case 6: exp = "1900 ~ 1999년에 태어난 여성"; break;
        	case 7: exp = "2000 ~ 2099년에 태어난 남성"; break;
        	case 8: exp = "2000 ~ 2099년에 태어난 여성"; break;
        	default: exp = "Invalid month"; break;
        	}
        	System.out.println(exp);
        }
	}
}
