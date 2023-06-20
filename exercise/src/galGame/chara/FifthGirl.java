package galGame.chara;

public class FifthGirl extends Girl{
	
	public FifthGirl(){
		//女の子の名前
		this.name = "三国蜜柑";
		this.nickname = "三国さん";
		
		//現在いる場所（2-B教室などの場所を意味する）
		this.positionNum = 0;
		
		//好感度
		this.intimacy = 0;
	}
	
	public void encount() {
		System.out.println("あ、"+this.nickname+"だ");
		System.out.println("どうしよう、話かけてみようか…");
	}
	
	
}