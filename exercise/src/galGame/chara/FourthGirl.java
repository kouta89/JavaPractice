package galGame.chara;

public class FourthGirl extends Girl{
	
	public FourthGirl(){
		//女の子の名前
		this.name = "秋月光梨";
		this.nickname = "秋月さん";
		
		//現在いる場所（2-B教室などの場所を意味する）
		this.positionNum = 0;
		
		//好感度
		this.intimacy = 0;
	}
	
	public void encount() {
		System.out.println("あ、あんなところに"+this.nickname+"がいる");
		System.out.println("どうしよう、話かけてみようか…");
	}
	
	
}