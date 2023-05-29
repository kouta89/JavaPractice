package exercise;

public class ArrayPractice{
	public static void main(String[] args){
		
		int[] score = new int[] {20,30,40,50,80};
		score[2] += 20;
		for(int value : score) {
			System.out.println(value);
		}
	}
}