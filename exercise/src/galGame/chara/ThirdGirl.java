package galGame.chara;

public class ThirdGirl extends Girl{
	
	public ThirdGirl(){
		//女の子の名前
		this.name = "鈴木翠華";
		
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