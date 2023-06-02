package exercise;

public class OverloadPractice{
	
	public static int add(int x,int y) {
		
		return x + y;
	}
	
	public static int add(int x,int y,int z) {
		
		return x + y+z;
	}

	
	public static void main(String[] args) {
		
		System.out.println("10+12="+ add(10,12));
		System.out.println("10+12+7="+ add(10,12,7));
	}
}