package galGame.main;
import java.util.ArrayList;
import java.util.Scanner;

import galGame.chara.FifthGirl;
import galGame.chara.FirstGirl;
import galGame.chara.FourthGirl;
import galGame.chara.Player;
import galGame.chara.SecondGirl;
import galGame.chara.SixthGirl;
import galGame.chara.ThirdGirl;
import galGame.school.ArtRoom;
import galGame.school.ClassRoom2b;
import galGame.school.ComputerRoom;
import galGame.school.Ground;
import galGame.school.GymFront;
import galGame.school.Library;
import galGame.school.MusicRoom;
import galGame.school.Rooftop;

public class GalApp{
	public static void main(String[] args) {
		
		//インスタンス化
		Scanner sc = new Scanner(System.in);
		Player player = new Player();
		
		//キャラクター
		freeTime();
		
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
		
		//インスタンス------------------------------
		//キャラクター
		FirstGirl firstGirl = new FirstGirl();
		SecondGirl secondGirl = new SecondGirl();
		ThirdGirl thirdGirl = new ThirdGirl();
		FourthGirl fourthGirl = new FourthGirl();
		FifthGirl fifthGirl = new FifthGirl();
		SixthGirl sixthGirl = new SixthGirl();
		
		//女の子が訪れる場所
		ClassRoom2b classRoom2b = new ClassRoom2b();
		GymFront gymFront = new GymFront();
		Ground ground = new Ground();
		ArtRoom artRoom = new ArtRoom();
		ComputerRoom computerRoom = new ComputerRoom();
		Library library = new Library();
		Rooftop rooftop = new Rooftop();
		MusicRoom musicRoom = new MusicRoom();
		
		//-------------------------------------------
		
		// 1～8までの数値を収める配列を6人分準備
		int[] num = new int[6];
		// 判定用の変数を準備
		boolean countFlg= false;

		// 6回、繰り返す
		for (int i = 0; i < num.length; i++) {
			// 毎回、1～8のランダムな数値を生成
			int raNum = (int) ((Math.random() * 8) + 1);
			// 毎回、生成された数と生成済みの数を比較
			
			for (int j = 0; j < num.length; j++) {
				
				// もし、生成済みの数値と同じものがあれば・・・
				if (num[j] == raNum) {
					countFlg = true;
				}
			}
			
			if (countFlg) {
				i--;
				countFlg = false;
				continue;
			} else {
				// 重複した数値が無ければ
				num[i] = raNum;
				
				//女の子の気まぐれ度合いによって普段いかない場所に行くかどうかの判定を行う（7以上であれば行く）
				int whiRanNum = (int) ((Math.random() * 10) + 1);
				int whimsyNum = 7;
				
				//女の子の現在いる場所を格納する
				switch(i) {
				case 0:
					
					//firstGirlは"1"か"2"か"3"が現在いる場所に指定されたとき、気まぐれ値が高い場合のみ向かう
					if(num[i] == 1) {
						
						if(whiRanNum >= whimsyNum) {
							firstGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else if(num[i] == 2){
						
						if(whiRanNum >= whimsyNum) {
							firstGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else if(num[i] == 3){
						
						if(whiRanNum >= whimsyNum) {
							firstGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else {
						firstGirl.setPositionNum(num[i]);
					}
					
					break;
				case 1:
					
					//secondGirlは"1"か"5"か"8"が現在いる場所に指定されたとき、気まぐれ値が高い場合のみ向かう
					if(num[i] == 1) {
						
						if(whiRanNum >= whimsyNum) {
							secondGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else if(num[i] == 5){
						
						if(whiRanNum >= whimsyNum) {
							secondGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else if(num[i] == 8){
						
						if(whiRanNum >= whimsyNum) {
							secondGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else {
						secondGirl.setPositionNum(num[i]);
					}
					
					break;
				case 2:
					
					//thirdGirlは"3"か"4"か"8"が現在いる場所に指定されたとき、気まぐれ値が高い場合のみ向かう
					if(num[i] == 3) {
						
						if(whiRanNum >= whimsyNum) {
							thirdGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else if(num[i] == 4){
						
						if(whiRanNum >= whimsyNum) {
							thirdGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else if(num[i] == 8){
						
						if(whiRanNum >= whimsyNum) {
							thirdGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else {
						thirdGirl.setPositionNum(num[i]);
					}
					
					break;
				case 3:
					
					//fourthGirlは"2"か"5"か"6"が現在いる場所に指定されたとき、気まぐれ値が高い場合のみ向かう
					if(num[i] == 2) {
						
						if(whiRanNum >= whimsyNum) {
							fourthGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else if(num[i] == 5){
						
						if(whiRanNum >= whimsyNum) {
							fourthGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else if(num[i] == 6){
						
						if(whiRanNum >= whimsyNum) {
							fourthGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else {
						fourthGirl.setPositionNum(num[i]);
					}
					
					break;
				case 4:
					
					//fifthGirlは"2"か"3"か"7"が現在いる場所に指定されたとき、気まぐれ値が高い場合のみ向かう
					if(num[i] == 2) {
						
						if(whiRanNum >= whimsyNum) {
							fifthGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else if(num[i] == 3){
						
						if(whiRanNum >= whimsyNum) {
							fifthGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else if(num[i] == 7){
						
						if(whiRanNum >= whimsyNum) {
							fifthGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else {
						fifthGirl.setPositionNum(num[i]);
					}
					
					break;
				case 5:
					
					//sixthGirlは"4"か"6"か"7"が現在いる場所に指定されたとき、気まぐれ値が高い場合のみ向かう
					if(num[i] == 2) {
						
						if(whiRanNum >= whimsyNum) {
							sixthGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else if(num[i] == 6){
						
						if(whiRanNum >= whimsyNum) {
							sixthGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else if(num[i] == 7){
						
						if(whiRanNum >= whimsyNum) {
							sixthGirl.setPositionNum(num[i]);
						}else {
							i--;
							continue;
						}
						
					}else {
						sixthGirl.setPositionNum(num[i]);
					}
					
					sixthGirl.setPositionNum(num[i]);
					break;
				}
				
				System.out.println("気まぐれ"+whiRanNum);
				System.out.println(num[i]);
				
				//キャラクターを配置するフィールドを指定する番号を代入
				switch(num[i]) {
				case 1:
					classRoom2b.setGirlNum(i);
					System.out.println(classRoom2b.getPlaceName());
					break;
				case 2:
					gymFront.setGirlNum(i);
					System.out.println(gymFront.getPlaceName());
					break;
				case 3:
					ground.setGirlNum(i);
					System.out.println(ground.getPlaceName());
					break;
				case 4:
					artRoom.setGirlNum(i);
					System.out.println(artRoom.getPlaceName());
					break;
				case 5:
					computerRoom.setGirlNum(i);
					System.out.println(computerRoom.getPlaceName());
					break;
				case 6:
					library.setGirlNum(i);
					System.out.println(library.getPlaceName());
					break;
				case 7:
					rooftop.setGirlNum(i);
					System.out.println(rooftop.getPlaceName());
					break;
				case 8:
					musicRoom.setGirlNum(i);
					System.out.println(musicRoom.getPlaceName());
					break;
				}
			}
		}
		
		//女の子が訪れなかった場所を特定し、その場所のgirlNumに誰もいないことを示す"0"を代入する------
		int girlQuantity = 6;
		int ereaQuantity = 8;
		boolean noOneHereFlg = false;
		int calculate = ereaQuantity - girlQuantity;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1;i <= ereaQuantity; i++) {
			for(int j = 0;j < girlQuantity; j++) {
				
				if(i == num[j]) {
					noOneHereFlg = true;
					break;
				}
				
			}
			
			if(noOneHereFlg == false) {
				list.add(i);
			}else {
				noOneHereFlg = false;
			}
		}
		
		for(int i=0;i<list.size();i++) {
			switch(list.get(i)) {
			case 1:
				classRoom2b.setGirlNum(0);
				System.out.println(classRoom2b.getPlaceName());
				break;
			case 2:
				gymFront.setGirlNum(0);
				System.out.println(gymFront.getPlaceName());
				break;
			case 3:
				ground.setGirlNum(0);
				System.out.println(ground.getPlaceName());
				break;
			case 4:
				artRoom.setGirlNum(0);
				System.out.println(artRoom.getPlaceName());
				break;
			case 5:
				computerRoom.setGirlNum(0);
				System.out.println(computerRoom.getPlaceName());
				break;
			case 6:
				library.setGirlNum(0);
				System.out.println(library.getPlaceName());
				break;
			case 7:
				rooftop.setGirlNum(0);
				System.out.println(rooftop.getPlaceName());
				break;
			case 8:
				musicRoom.setGirlNum(0);
				System.out.println(musicRoom.getPlaceName());
				break;
			}
		}
		
		//-----------------------------------------------------------------------------------------
		
		System.out.println(firstGirl.getPositionNum() + firstGirl.getGirlName());
		System.out.println(secondGirl.getPositionNum() + secondGirl.getGirlName());
		System.out.println(thirdGirl.getPositionNum() + thirdGirl.getGirlName());
		System.out.println(fourthGirl.getPositionNum() + fourthGirl.getGirlName());
		System.out.println(fifthGirl.getPositionNum() + fifthGirl.getGirlName());
		System.out.println(sixthGirl.getPositionNum() + sixthGirl.getGirlName());
	

	}
	
	static void move() {
		
		//インスタンス化
		Scanner sc = new Scanner(System.in);
		
		//キャラクター
		ClassRoom2b classRoom2b = new ClassRoom2b();
		GymFront gymFront = new GymFront();
		Ground ground = new Ground();
		ArtRoom artRoom = new ArtRoom();
		ComputerRoom computerRoom = new ComputerRoom();
		Library library = new Library();
		Rooftop rooftop = new Rooftop();
		MusicRoom musicRoom = new MusicRoom();
		
		
		
		//選択肢
		int select = 0;
		
		do {
			System.out.println("場所> 1:2-Bの教室　2:体育館前　3:グラウンド　4:美術室　"
					+ "5:コンピュータ室　6:図書室　7:屋上　8:音楽室");
			select = sc.nextInt();
			
			switch(select){
			case 1:
				//if(classRoom2b.getGirlNum() )
//				
				
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