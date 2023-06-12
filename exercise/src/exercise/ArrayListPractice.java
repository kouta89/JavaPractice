package exercise;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		 
        //1～8の整数値を持つリストを用意
        for(int i = 1 ; i <= 8 ; i++) {
                list.add(i);
        }
        //リストを表示（確認用）
        System.out.println(list);

       //shuffleメソッドで上で作ったリストをシャッフル
        Collections.shuffle(list);

        //ランダムにした結果を表示
        System.out.println(list);
        System.out.println(list.get(3));
	}
}