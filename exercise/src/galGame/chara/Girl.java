package galGame.chara;


public class Girl{
	
	//女の子の名前
	public String name = "";
	
	public int positionNumber = 0;
	
	//好感度
	static int intimacy;
	
	public Girl(){
		intimacy = 0;
	}
	
	String showStatus() {
		return String.format("%s(好感度：%d)", this.name,intimacy);
	}
	
	public void talk() {
		System.out.println(this.name+"さんがいる");
		System.out.println("どうしよう、話かけてみようか…");
	}
}