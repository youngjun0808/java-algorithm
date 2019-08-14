package prac;

public class ExSum1to10 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i < 10) {
				System.out.print(i*2 + "+");
			}else {
				System.out.print(i*2 + "=");
			}
		}
	}
}
