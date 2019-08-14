package engine;

public class Sum1to10 {
	
	public static void main(String[] args) {
		// 1 + 2 + 3 + 4 + 5 =
		String eval = "";
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i==10) {
				eval += i+" = ";
				//sum += i;
			}else {	
				eval += i+" + ";
				//sum += i;
			}
			sum += i;
			//공통사항은 보기 안좋으므로 바깥으로 뺀다.
		}
		System.out.print(eval + sum);
	}
}

