package exercise;

public class First {

	public static void main(String[] args) {
		// 1～8までの数値を収める配列を準備
		int[] num = new int[6];
		// 判定用の変数を準備
		boolean countFlg= false;

		// 6回、繰り返す
		for (int i = 0; i < num.length; i++) {
			// 毎回、1～8のランダムな数値を生成
			int raNum = (int) ((Math.random() * 8) + 1);
			// 毎回、生成された数と生成済みの数を比較
			
			for (int j = 0; j < num.length; j++) {
				// もし、生成済みの数値と同じものがあれば・・・
				if (num[j] == raNum) {
					countFlg = true;
				}
			}
			
			if (countFlg) {
				i--;
				countFlg = false;
				continue;
			} else {
				// 重複した数値が無ければ
				num[i] = raNum;
				System.out.print(num[i] + ",");
			}
		}
	}

}
