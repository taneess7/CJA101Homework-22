package hw1;

public class Hw1 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int x = 12, y = 6 , sum1 = x + y , pro1 = x * y;
		System.out.printf("12跟6的和為 %d %n",sum1);
		System.out.printf("12跟6的積為 %d %n",pro1);
		System.out.println("------------------------------");
		
//		• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int eggs = 200 ;
		double A2 = eggs/12;
		System.out.printf("200顆蛋共是 %.0f 打 %n", A2);		
		System.out.println("------------------------------");
		
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sec = 256559;
        int day = sec / (24 * 60 * 60);            // 計算天數
        int hr = (sec % (24 * 60 * 60)) / (60*60); // 剩餘的秒數換算成小時
        int min = (sec % (60*60)) / 60;               // 剩餘的秒數換算成分鐘
        int remainingSec = sec % 60;               // 剩餘的秒數
        System.out.printf("256559 秒為 %d 天、%d 小時、%d 分與 %d 秒%n", day, hr, min, remainingSec);
        System.out.println("------------------------------");
       
//		• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		double pi = 3.1415 , r = 5 , s = Math.pow(r,2)*pi ,c = r*2*pi;	
		System.out.printf("半徑為5的圓面積 = %.4f 與圓周長 = %.3f %n",s,c);
		System.out.println("------------------------------");
		
//		• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢(用複利計算，公式請自行google)
		double P = 1500000; // 本金 150 萬
        double Rr = 0.02;    // 年利率 2%
        int t = 10;         // 存款年數 10 年
        double A = P * Math.pow(1 + Rr, t);
        System.out.printf("10 年後的本利和為 %.2f 元%n", A);
        System.out.println("------------------------------");
		
//		• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
        System.out.println(5 + 5); // 10，因為都是整數相加 (int + int)
        System.out.println(5 + '5'); // 58，(講義P.51)因為單引號是字元，會轉成對應編碼 '5' 的 ASCII 值為 53，所以 5 + 53 = 58
        System.out.println(5 + "5"); // "55"，因為雙引號是字串，數字 5 被轉為字串，字串拼接變成 "55"
				
	}
}
