package galGame.chara;

public class FifthGirl extends Girl{
	
	public FifthGirl(){
		//女の子の名前
		this.name = "三国蜜柑";
		
		//配置場所
		this.positionNum = 0;
		
		//好感度
		this.intimacy = 0;
	}
	
	public void talk() {
		System.out.println(this.name+"さんがいる");
		System.out.println("どうしよう、話かけてみようか…");
	}
	
	
}