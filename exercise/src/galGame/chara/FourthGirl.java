package galGame.chara;

public class FourthGirl extends Girl{
	
	public FourthGirl(){
		//女の子の名前
		this.name = "秋月光梨";
		
		//現在いる場所（2-B教室などの場所を意味する）
		this.positionNum = 0;
		
		//好感度
		this.intimacy = 0;
	}
	
	public void talk() {
		System.out.println(this.name+"さんがいる");
		System.out.println("どうしよう、話かけてみようか…");
	}
	
	
}