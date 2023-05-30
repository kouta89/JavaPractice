package practice;
import java.util.Scanner;

public class Practice5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = {3,4,9};
		
		System.out.println("1桁の数字を入力");
		int input = scanner.nextInt();
		
	
		for(int number : numbers) {
			
			if(number==input) {
				System.out.println("あたり");
			}
		}
		
	}
}