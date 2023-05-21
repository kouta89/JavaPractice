package exercise;
import java.util.Scanner;

public class InputString{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("名前を入力");
		String name = scanner.nextLine();
		
		System.out.println("年齢を入力");
		int age = scanner.nextInt();
		System.out.println(name+"さん"+age+"さい");
	}
}