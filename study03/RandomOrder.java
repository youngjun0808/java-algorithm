package study03;
import java.util.Random;

public class RandomOrder {
	public static void main(String[] args) {
		Random r = new Random(6);
		int team = 0;
		int[] arr = new int[6];
		for(int i=0; i<6; i++) {
			team = r.nextInt(6)+1;
			if(team != 1 && team != 6 && team != 3) {
			System.out.println(team);
			}
		}
		
	}

}
