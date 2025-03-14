package hw2;

public class Hw2 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int i ,sum = 0;
		for (i=2 ;i<=1000;i+=2) {
			sum += i;	
		};
		System.out.println("1～1000 的偶數總和：" + sum);
		
//		• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		sum = 1;
		for (i = 1; i <= 10; i++) {
			sum *= i;
		};
		System.out.println("1～10的連乘積：" + sum);
		
//		• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		i = 1;
		sum = 1;
		while (i <= 10) {
			sum*=i;
			i++;
		};
		System.out.println("1～10的連乘積：" + sum);
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		i = 1;
		sum = 0;
		for(i=1;i<=10;i++) {
			sum = (int)Math.pow( i ,2);
			System.out.print(sum+" ");
		};
		System.out.println();
		
//		• 阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		
		int count = 0; // 記錄符合條件的數字總數

        System.out.println("阿文可以選擇的數字：");
        for (int num = 1; num <= 49; num++) {
            // 判斷是否包含數字 4
            if (num % 10 == 4 || num / 10 == 4) {
                continue; // 跳過含 4 的數字
            }
            // 輸出數字
            System.out.print(num + " ");
            count++;
        }
        // 輸出總數
        System.out.println("\n總共有：" + count + " 個可選擇的數字");
		
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		int j;
		for ( i = 10; i > 0; i--) {  // 控制行數，從 10 到 1
            for ( j = 1; j <= i; j++) {  // 控制每行的數字輸出範圍
                System.out.print(j + " ");  // 印出數字 (不換行)
            }
            System.out.println(); // 每列結束後換行
        }
		
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
        
        for (i=1;i<=6;i++) {
        	char letter = (char) (64+i);
			for(j=1;j <= i;j++) {
				System.out.print(letter);
			}
			System.out.println();
		}
		
	}
}
