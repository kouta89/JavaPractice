package exercise;
import java.util.Random;

public class RandomTest{
	public static void main(String[] args) {
		
		Random rand = new Random();
		int r = rand.nextInt(13)+1;
		
		Word(r);
	}
	
	public static void Word(int number) {
		
		switch(number) {
		case 1:
			System.out.println("自己PRと経歴を含めた自己紹介");
			break;
		case 2:
			System.out.println("前職の入社理由、前職の転職理由");
			break;
		case 3:
			System.out.println("なぜエンジニアになりたいか");
			break;
		case 4:
			System.out.println("他の人からどんな人と言われるか");
			break;
		case 5:
			System.out.println("趣味はあるか");
			break;
		case 6:
			System.out.println("スクールでどのような勉強をしていたか");
			break;
		case 7:
			System.out.println("スクールでの学習後勉強をしているか");
			break;
		case 8:
			System.out.println("チーム開発時の自身の役割");
			break;
		case 9:
			System.out.println("PF制作で苦労したこと");
			break;
		case 10:
			System.out.println("転職のきっかけ");
			break;
		case 11:
			System.out.println("前職の業務内容");
			break;
		case 12:
			System.out.println("志望理由");
			break;
		case 13:
			System.out.println("仕事とは、何が大切だと思うか");
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