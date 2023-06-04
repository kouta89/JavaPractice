package practice;
import java.util.Scanner;

public class Practice6{
	public static void main(String[] args) {
		//introduceOneself();
		
		String title = "うそだよ";
		String address = "kokiti@gmail.com";
		String text = "だまされたね";
		//email(title,address,text);
		
		email(address,text);
		
		double bottom = 10.0;
		double height = 5.0;
		double radius = 5.0;
		
		double triangleArea = calcTriangleArea(bottom,height);
		System.out.println("三角形の面積:"+triangleArea+"平方cm");
		
		double circleArea = calcCircleArea(radius);
		System.out.println("円の面積:"+circleArea+"平方cm");
	}
	
	public static void introduceOneself(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("名前を入力");
		String name = scanner.nextLine();
		
		System.out.println("年齢を入力");
		int age = scanner.nextInt();
		
		System.out.println("身長を入力（例：170.2）");
		double height = scanner.nextDouble();
		
		System.out.println("性別を入力（男or女)");
		char gender = scanner.next().charAt(0);
	
		
		System.out.println(name+"、"+age+"歳です。");
		System.out.println("身長は"+height+"、"+gender+"です。");
	}
	
	public static void email(String title,String address,String text) {
		
		System.out.println("「"+address+"」に、以下のメールを送信しました");
		System.out.println("件名：「"+title+"」");
		System.out.println("本文：「"+text+"」");
		
	}
	
	public static void email(String address,String text) {
		
		System.out.println("「"+address+"」に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：「"+text+"」");
		
	}
	
	public static double calcTriangleArea(double bottom,double height){
		double triangleArea = (bottom * height) / 2;
		
		return triangleArea;
	}
	
	public static double calcCircleArea(double radius){
	
		double circleArea = radius * radius * 3.14;
		
		return circleArea;
	}
	
	
}