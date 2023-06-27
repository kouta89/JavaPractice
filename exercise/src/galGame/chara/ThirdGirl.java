package galGame.chara;

public class ThirdGirl extends Girl{
	
	public static Player player = new Player();
	
	public ThirdGirl(){
		//女の子の名前
		this.name = "鈴木翠華";
		this.nickname = "翠華";
		
		//現在いる場所（2-B教室などの場所を意味する）
		this.positionNum = 0;
		
		//好感度
		this.intimacy = 0;
	}
	
	public void encount() {
		System.out.println("あそこにいるのは"+this.nickname+"だな");
		System.out.println("どうしよう、話かけてみようか…");
	}
	
	public void encount1() {
		System.out.println("あそこにいるのは"+this.nickname+"だな");
		System.out.println("………");
		System.out.println("あ、"+player.getFirstName()+"じゃん");
		System.out.println("どうしたんよ、しけた面さらしちゃってさ");
		System.out.println("どうしよう、今日は"+this.nickname+"と話そうか…");
	}
	
	public void addTalk() {
		System.out.println("ああ、お話しね、おーきーどーきー");
	}
}