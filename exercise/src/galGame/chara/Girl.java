package galGame.chara;

public class Girl{
	
	//女の子の名前
	protected String name = "";
	
	//現在いる場所（2-B教室などの場所を意味する）
	protected int positionNum = 0;
	
	//好感度
	protected int intimacy = 0;
	
	//ゲッター
	public String getGirlName(){return name;}
	public int getPositionNum() {return positionNum;}
	
	//セッター
	public void setPositionNum(int positionNum) {this.positionNum = positionNum;}
	
	public String showStatus() {
		return String.format("%s(好感度：%d)", this.name,intimacy);
	}
}