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
	
	public void encount() {
		System.out.println("あれは"+this.nickname+"かな");
		System.out.println("どうしよう、話かけてみようか…");
	}
	
	
}