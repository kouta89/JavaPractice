package galGame.chara;

public class SixthGirl extends Girl{
	
	public SixthGirl(){
		//女の子の名前
		this.name = "琴原紫音";
		
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