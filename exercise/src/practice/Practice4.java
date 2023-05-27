package practice;
import java.util.Random;
import java.util.Scanner;

public class Practice4{
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		int ans = rand.nextInt(10);
		
		for(int i=0;i<5;i++) {
			System.out.println("0～9の数字を入力");
			int num = scanner.nextInt();
			
			if(num==ans) {
				System.out.println("あたり");
				break;
			}else {
				System.out.println("違う");
			}
		}
		
		System.out.println("終了");
		
	}
}