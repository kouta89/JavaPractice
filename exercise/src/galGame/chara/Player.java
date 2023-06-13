package galGame.chara;


public class Player{
	
	//主人公の名前
	private String name;
	
	//ゲッター
	public String getPlayerName() {return this.name;}
	//セッター
	public void setPlayerName(String playerName) {this.name = playerName;}
	
	void move() {
		
		System.out.println("どうしよう、話かけてみようか…");
	}
		
}