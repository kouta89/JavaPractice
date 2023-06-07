package comicScene.scene1;

public class LatterHalf{
	public static void villan() {
		
		System.out.println("カイジ：　あんた間違いなく悪人だけど");
		System.out.println();
	}
	
	public static void fair() {
		
		try {
            Thread.sleep(3000);
            System.out.println("カイジ：　しかしどこか、フェアー");
		} catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		System.out.println("カイジ：　公平だ");
		System.out.println("会長の息子：　公平？");
		System.out.println();
	}
}