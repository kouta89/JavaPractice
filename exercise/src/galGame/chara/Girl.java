package galGame.chara;


public class Girl{
	
	//女の子の名前
	public String name;
	//好感度
	public int intimacy = 0;
	
	
	String showStatus() {
		return String.format("%s(好感度：%d)", this.name,this.intimacy);
	}
	
	void talk() {
		System.out.println(this.name+"さんがいる");
		System.out.println("どうしよう、話かけてみようか…");
	}
}