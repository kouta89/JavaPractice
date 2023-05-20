package exercise;
import java.util.Random;

public class RandomTest{
	public static void main(String[] args) {
		Random rand = new Random();
		int r = rand.nextInt(90);
		
		System.out.println("あなたは"+r+"さい");
	}
}