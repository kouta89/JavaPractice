package exercise;
import java.util.Random;

public class RandomTest{
	public static void main(String[] args) {
		
		Random rand = new Random();
		int r = rand.nextInt(21)+1;
		
		Word(r);
	}
	
	public static void Word(int number) {
		
		switch(number) {
		case 1:
			System.out.println("自己紹介+自己PR");
			break;
		case 2:
			System.out.println("志望理由");
			break;
		case 3:
			System.out.println("自身の強み・弱み");
			break;
		case 4:
			System.out.println("何がしたいのか、何が出来るのか");
			break;
		case 5:
			System.out.println("前職で身についた能力");
			break;
		case 6:
			System.out.println("前職で苦労したこと");
			break;
		case 7:
			System.out.println("前職での成功体験");
			break;
		case 8:
			System.out.println("前職の入社のきっかけ");
			break;
		case 9:
			System.out.println("尊敬する人はいるか");
			break;
		case 10:
			System.out.println("IT業界に興味を持ったきっかけ");
			break;
		case 11:
			System.out.println("就活の軸");
			break;
		case 12:
			System.out.println("大学時代の研究内容");
			break;
		case 13:
			System.out.println("部活動について");
			break;
		case 14:
			System.out.println("スクールの学習内容");
			break;
		case 15:
			System.out.println("チーム開発について");
			break;
		case 16:
			System.out.println("プログラミングを実際学んでみてどうだったか");
			break;
		case 17:
			System.out.println("ポートフォリオで苦労したこと");
			break;
		case 18:
			System.out.println("キャリアプラン");
			break;
		case 19:
			System.out.println("プログラミングを学習して感じたこと");
			break;
		case 20:
			System.out.println("今勉強している事");
			break;
		case 21:
			System.out.println("逆質問");
			break;
		}
		
		
	}
}