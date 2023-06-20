package galGame.chara;

public class Girl{
	
	//女の子の名前
	protected String name = "";
	//主人公の呼び方
	protected String nickname = "";
	
	//現在いる場所（2-B教室などの場所を意味する）
	protected int positionNum;
	
	//好感度
	protected int intimacy;
	
	//ゲッター
	public String getGirlName(){return name;}
	public int getPositionNum() {return positionNum;}
	
	//セッター
	public void setPositionNum(int positionNum) {this.positionNum = positionNum;}
	
	public String showStatus() {
		return String.format("%s(好感度：%d)", this.name,intimacy);
	}
}