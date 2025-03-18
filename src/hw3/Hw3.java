package hw3;

//CJA101_22
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Hw3 {
	public static void main(String[] args) {
//		
//		請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形，如圖示結果：

//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("請輸入三個整數：");
//			System.out.print(">> ");
//			int d1 = sc.nextInt();
//			int d2 = sc.nextInt();
//			int d3 = sc.nextInt();
//
//			// 先排除所有不是三角形的，減少迴圈次數
//			if (d1 == 0 || d2 == 0 || d3 == 0 || d1 + d2 <= d3 || d1 + d3 <= d2 || d3 + d2 <= d1) {
//				System.out.println("不是三角形");
//			} else if (d1 == d2 && d2 == d3) {
//				System.out.println("正三角形");
//			} else if (d1 == d2 || d2 == d3 || d3 == d1) {
//				System.out.println("等腰三角形");
//			} else {
//				System.out.println("其他三角形");
//			}
//		}

//		請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//		對則顯示正確訊息，如圖示結果：

		int random = (int) (Math.random() * 11);
		try (Scanner sc2 = new Scanner(System.in)) {
			System.out.println("開始猜數字吧：");
			System.out.print(">> ");
			int g1 = sc2.nextInt();
			
			while(g1 != random ) {
				if(g1>9||g1<0) {
					System.out.println("請輸入0～9的數字喔");
					System.out.print(">> ");
					g1 = sc2.nextInt();
				}else if(g1 == random ){
					System.out.println("答對了答案就是 "+random);
					break;
				}else {
					System.out.println("猜錯囉");
					System.out.print(">> ");
					g1 = sc2.nextInt();
				}
			}
			if(g1 == random ){
			System.out.println("答對了答案就是 "+random);
			}
			
		}

//		阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數，如圖：

//		try (Scanner sc3 = new Scanner(System.in)) {
//			System.out.println("阿文...請輸入你討厭的數字：");
//			System.out.print(">> ");
//			int hate = sc3.nextInt();
//
//			ArrayList<Integer> allowedNumbers = new ArrayList<>();
//			System.out.println("阿文可以選擇的數字：");
//			for (int num = 1; num <= 49; num++) {
//				// 判斷是否包含數字 4
//				if (num % 10 == hate || num / 10 == hate) {
//					continue; // 跳過含 4 的數字
//				}
//				// 加進去List
//				allowedNumbers.add(num);
//
//			}
//
//			// 輸出符合條件的數字總數與列表
//			System.out.println("總共有：" + allowedNumbers.size() + " 個可選擇的數字");
//			System.out.println("阿文可以選擇的數字：");
//			for (int n : allowedNumbers) {
//				System.out.print(n + " ");
//			}
//			System.out.println();
//
//			// 將列表亂數排序，並選取前 6 個不重複的號碼
//			Collections.shuffle(allowedNumbers);
//			System.out.println("隨機選出的 6 個號碼：");
//			for (int i = 0; i < 6 && i < allowedNumbers.size(); i++) {
//				System.out.print(allowedNumbers.get(i) + " ");
//			}
//		}

	}
}
