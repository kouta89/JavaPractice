package galGame.main;
import java.util.Random;
import java.util.Scanner;

import galGame.chara.Gal;
import galGame.chara.Player;

public class GalApp{
	public static void main(String[] args) {
		
		//インスタンス化
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		Player player = new Player();
		Gal gal = new Gal();
		
		//主人公の名前を入力
		System.out.println("僕の名前は…");
		player.name = sc.nextLine();
		
		System.out.println(player.name+"だ。");
		
		System.out.println("もうすぐ夏休みだ…");
		System.out.println("このままじゃだめだよな。今年こそ、彼女と夏休みを過ごしたい！");
		System.out.println("勇気を出して気になる子に声を掛けてみよう！");
		
		
		
		freeMove();
		
		
		
//		final String[] charas= {"東山きりの","春日 小麦","卯月 結華","秋月 茜梨","琴原 葵"};
//		ArrayList<Gal> list = new ArrayList<>();
//		
//		int actionDays = 28;
//		for(int i=0;i<actionDays;i++) {
//			
//			if((actionDays%7)==0) {
//				
//			}else {
//				String chara = charas[rand.nextInt(charas.length)];
//				
//			}
//		}
	}
	
	static void freeMove(){
		Scanner sc = new Scanner(System.in);
		
		//選択肢
		int select = 0;
		
		do {
			System.out.println("行動> 1:学校内を歩く　2:好感度を確認する　3:ゲームを終了する");
			select = sc.nextInt();
			
			switch(select){
			case 1:
				break;
			case 2:
				
				
				break;
			case 3:
				System.out.println("ゲームを終了します");
				break;
			default :
				System.out.println("選択肢にしたがって数字を入力してください");
			}
		}while(select > 3 || select < 1);
	}
	

}