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
	
	public void encount1() {
		System.out.println("ん、あれは"+this.nickname+"じゃないか");
		System.out.println("………");
		System.out.println("あ、センパイ");
		System.out.println("あのー、何でしょうか");
		System.out.println("どうしよう、話かけてみようか…");
	}
	
	public void addTalk() {
		System.out.println("そうですね、まず何から話しましょうか");
	}
}