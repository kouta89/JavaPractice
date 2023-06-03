package exercise;
import java.util.Random;

public class RandomTest{
	public static void main(String[] args) {
		
		Random rand = new Random();
		int r = rand.nextInt(8)+1;
		
		Word(r);
	}
	
	public static void Word(int number) {
		
		switch(number) {
		case 1:
			System.out.println("一次面接はどうだったか/なにを思ったか");
			break;
		case 2:
			System.out.println("聞きたいことはあるか（逆質問）");
			break;
		case 3:
			System.out.println("転職きっかけ");
			break;
		case 4:
			System.out.println("自分の人生観");
			break;
		case 5:
			System.out.println("SEのイメージ");
			break;
		case 6:
			System.out.println("うちがマッチしていると思うか");
			break;
		case 7:
			System.out.println("ITに関連したディスカッション");
			break;
		case 8:
			System.out.println("仕事とは、何が大切だと思うか");
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