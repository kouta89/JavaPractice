package galGame.chara;

public class SecondGirl extends Girl{
	
	public SecondGirl(){
		//女の子の名前
		this.name = "春日小麦";
		this.nickname = "春日さん";
		
		//現在いる場所（2-B教室などの場所を意味する）
		this.positionNum = 0;
		
		//好感度
		this.intimacy = 0;
	}
	
	public void encount1() {
		System.out.println("あそこにいるのは"+this.nickname+"かな");
		System.out.println("………");
		System.out.println("あ、"+player.getLastName()+"先輩！");
		System.out.println("こんなところで何してるんですか？");
		System.out.println("どうしよう、"+this.nickname+"と話そうか…");
	}
	
	public void addTalk() {
		System.out.println("仕方ないので付き合ってあげます！");
	}
	
	
}