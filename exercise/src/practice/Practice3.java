package practice;
import java.util.Scanner;

public class Practice3{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[メニュー]1:検索2:登録3:削除4:変更>");
		int selected = scanner.nextInt();
		
		switch(selected){
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		default:
			System.out.println("私は何もしない");
		}
		
	}
}