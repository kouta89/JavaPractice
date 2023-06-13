package galGame.chara;

public class Girl{
	
	//女の子の名前
	protected String name = "";
	
	//配置場所
	protected int positionNum = 0;
	
	//好感度
	protected int intimacy = 0;
	
	//ゲッター
	public String getGirlName(){return name;}
	public int getPositionNum() {return positionNum;}
	
	//セッター
	public void setPostionNum(int positionNum) {this.positionNum = positionNum;}
	
	public String showStatus() {
		return String.format("%s(好感度：%d)", this.name,intimacy);
	}
}