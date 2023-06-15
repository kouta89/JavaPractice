package galGame.school;

public class School{
	
	//場所名
	protected String name = "";
	//この場所を訪れた女の子の番号
	protected int girlNum = 0;
	
	//ゲッター
	public String getPlaceName(){return name;}
	public int getGirlNum() {return girlNum;}
	
	//セッター
	public void setGirlNum(int girlNum) {this.girlNum = girlNum;}

}