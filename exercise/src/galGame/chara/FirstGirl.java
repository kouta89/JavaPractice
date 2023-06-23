package galGame.chara;

public class FirstGirl extends Girl{
	
	public FirstGirl(){
		//女の子の名前
		this.name = "東山霧乃";
		this.nickname = "東山さん";
		
		//現在いる場所（2-B教室などの場所を意味する）
		this.positionNum=0;
		
		//好感度
		this.intimacy=0;
	}
	
	public void encount() {
		System.out.println("ん、あの人は、"+this.nickname+"じゃないか");
		System.out.println("どうしよう、話かけてみようか…");
	}
}