package practice;
import java.util.Random;
import java.util.Scanner;

public class Practice1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ようこそ占いの館へ");
		
		System.out.println("あなたの名前を入力してください");
		String name = scanner.nextLine();
		
		System.out.println("あなたの年齢を入力してください");
		String ageString = scanner.nextLine();
		
		int age = Integer.parseInt(ageString);
		
		Random rand = new Random();
		int fortune = rand.nextInt(3);
		fortune++;
		
		System.out.println("画面に占いの結果が出ました。");
		System.out.println(age+"歳の"+name+"さん、あなたの運勢は");
		if(fortune==1) {
			System.out.println("大吉");
		}else if(fortune==2) {
			System.out.println("中吉");
		}else if(fortune==3) {
			System.out.println("小吉");
		}else {
			System.out.println("凶");
		}
		
	}
}