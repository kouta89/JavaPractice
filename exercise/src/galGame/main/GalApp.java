package galGame.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import galGame.chara.Player;
import galGame.chara.SecondGirl;
import galGame.school.School;

public class GalApp{
	public static void main(String[] args) {
		
		//インスタンス化
		Scanner sc = new Scanner(System.in);
		Player player = new Player();
		
		//キャラクター
		SecondGirl secondGirl = new SecondGirl();
		System.out.println(secondGirl.getGirlName());
		
//		Girl[] girls = new Girl[5];
//		girls[0].name = "東山霧乃";
//		girls[1].name = "春日小麦";
//		girls[2].name = "鈴木翠華";
//		girls[3].name = "秋月光梨";
//		girls[4].name = "三国蜜柑";
//		girls[5].name = "琴原紫音";
		
		//キャラクターが訪れる場所
		School school = new School();
//		school.name = "2-Bの教室";
//		school.girl = girls;
//		System.out.println("2-Bの教室にいるのは"+school.girl.name);
//		School[] school = new School[7];
//		school[0].name = "2-Bの教室";
//		school[1].name = "体育館前";
//		school[2].name = "グラウンド";
//		school[3].name = "美術室";
//		school[4].name = "コンピュータ室";
//		school[5].name = "図書室";
//		school[6].name = "玄関ホール";
//		school[7].name = "音楽室";
		
		//主人公の名前を入力
		System.out.println("僕の名前は…");
		player.setPlayerName(sc.nextLine());
		
		while((player.getPlayerName().length() < 0) && (player.getPlayerName().length() >= 8)) {
			System.out.println("1文字以上、８文字以内でご入力ください");
			player.setPlayerName(sc.nextLine());
		}
		
		System.out.println(player.getPlayerName()+"だ。");
		
		System.out.println("もうすぐ夏休みだ…");
		System.out.println("このままじゃだめだよな。今年こそ、彼女と夏休みを過ごしたい！");
		System.out.println("勇気を出して気になる子に声を掛けてみよう！");
		
		
		
		freeTime();
		
		
		
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
	
	static void freeTime(){
		Scanner sc = new Scanner(System.in);
		
		//選択肢
		int select = 0;
		
		do {
			System.out.println("行動> 1:学校内を歩く　2:好感度を確認する　3:ゲームを終了する");
			select = sc.nextInt();
			
			switch(select){
			case 1:
				positioning();
				move();
				
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
	
	static void positioning() {
		
		//キャラクター
		SecondGirl[] girls = new SecondGirl[5];
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		 
        //1～8の整数値を持つリストを用意
        for(int i = 1 ; i <= 8 ; i++) {
                list.add(i);
        }
        //リストを表示（確認用）
        System.out.println(list);

       //shuffleメソッドで上で作ったリストをシャッフル
        Collections.shuffle(list);

        //ランダムにした結果を表示
        System.out.println(list);
        
		//キャラクターを配置するフィールドを指定する番号を代入
			
//		for(int i= 0;i<girls.length;i++) {
//			girls[i].setPositionNum(list.get(i));
//		}
		

	}
	
	static void move() {
		
		//インスタンス化
		Scanner sc = new Scanner(System.in);
		
		//キャラクター
		SecondGirl[] girls = new SecondGirl[5];
		
		
		//選択肢
		int select = 0;
		
		do {
			System.out.println("場所> 1:2-Bの教室　2:体育館前　3:グラウンド　4:美術室　"
					+ "5:コンピュータ室　6:図書室　7:玄関ホール　8:音楽室");
			select = sc.nextInt();
			
			switch(select){
			case 1:
//				for(int i= 0;i<girls.length;i++) {
//					if(girls[i].positionNumber == 1) {
//						girls[i].talk();
//						break;
//					}
//				}
				
				break;
				
			case 2:
//				for(int i= 0;i<girls.length;i++) {
//					if(girls[i].positionNumber == 2) {
//						girls[i].talk();
//						break;
//					}
//				}
				
				break;
				
			case 3:
//				for(int i= 0;i<girls.length;i++) {
//					if(girls[i].positionNumber == 3) {
//						girls[i].talk();
//						break;
//					}
//				}
				
				break;
				
			case 4:
//				for(int i= 0;i<girls.length;i++) {
//					if(girls[i].positionNumber == 4) {
//						girls[i].talk();
//						break;
//					}
//				}
				
				break;
				
			case 5:
//				for(int i= 0;i<girls.length;i++) {
//					if(girls[i].positionNumber == 5) {
//						girls[i].talk();
//						break;
//					}
//				}
				
				break;
				
			case 6:
//				for(int i= 0;i<girls.length;i++) {
//					if(girls[i].positionNumber == 6) {
//						girls[i].talk();
//						break;
//					}
//				}
				
				break;
			
			case 7:
//				for(int i= 0;i<girls.length;i++) {
//					if(girls[i].positionNumber == 7) {
//						girls[i].talk();
//						break;
//					}
//				}
				
				break;
				
			case 8:
//				for(int i= 0;i<girls.length;i++) {
//					if(girls[i].positionNumber == 8) {
//						girls[i].talk();
//						break;
//					}
//				}
				
				break;
			default :
				System.out.println("選択肢にしたがって数字を入力してください");
			}
		}while(select > 8 || select < 1);
	}

}