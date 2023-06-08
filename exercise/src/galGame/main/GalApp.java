package galGame.main;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GalApp{
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		final String[] charas= {"東山きりの","春日 小麦","卯月 結華","秋月 茜梨","琴原 葵"};
		ArrayList<Gal> list = new ArrayList<>();
		
		int actionDays = 28;
		for(int i=0;i<actionDays;i++) {
			
			if((actionDays%7)==0) {
				
			}else {
				String chara = charas[rand.nextInt(charas.length)];
				
			}
		}
	}
	
	class FreeMove{
		
	}
	
	class Gal{
		String chara="";
		int intimacy=0;
		
		Gal(String chara){
			this.chara=chara;
		}
		
		String showStatus() {
			return String.format("%s(%d)", this.chara,this.intimacy);
		}
		
		void play() {
			System.out.println(this.chara+"さんがいる");
			System.out.println("どうしよう、話かけてみようか…");
		}
	}
}