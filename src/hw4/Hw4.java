package hw4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hw4 {
	public static void main(String[] args) {
		
//		• 有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示：陣列，length屬性)
		int[] n= {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for(int i = 0; i<n.length;i++) {
			
			sum+=n[i];
			
		}
		
		double e = sum/n.length;
		System.out.println("平均值："+e);
		
		System.out.print("大於平均值的元素: ");
        for (int i = 0; i < n.length; i++) {
            if (n[i] > e) {
                System.out.print(n[i] + " ");
            }
		
        }
		
//		• 請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
//		(提示：String方法，陣列)
		
		String s = "Hello World";
		String reversed = new StringBuilder(s).reverse().toString();
		System.out.println(reversed); // 輸出：dlroW olleH

		
//		• 有個字串陣列如下(八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示：字元比對，String方法)
		
		// 建立字串陣列，裡面包含八大行星的英文名稱
        String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        
        // 初始化母音計數器
        int vowelCount = 0;
        
        // 逐一讀取陣列中的每個字串
        for (String planet : planets) {
            // 對於每個字串，逐一檢查其中的每個字元
            for (int i = 0; i < planet.length(); i++) {
                char ch = planet.charAt(i);
                // 判斷字元是否為母音（a, e, i, o, u）
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }
        }
     // 輸出計算結果
        System.out.println("總共有 " + vowelCount + " 個母音");
		
//		• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
//		表如下：
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共3 人!」
//		(提示：Scanner，二維陣列)
		int[][] employeeCash = {
				{25,2500},
				{32,800},
				{8,500},
				{19,1000},
				{27,1200}
				};
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入想要界的金額：");
		System.out.print(">>>");
		
		try {
			int loan = sc.nextInt();
			
			int[] eligibleIds = new int[employeeCash.length];
			
			int count = 0 ;
			
			for (int[] employee : employeeCash) {
				int empId = employee [0];
				int cash = employee [1];
				
				if( cash >= loan ) {
					eligibleIds[count] = empId;
					count++;
				}	
			}
			
		if (count == 0) {
			System.out.println("沒有同事可以借錢");
			
		} else {
			//將陣列中有效的元素轉為字串
			StringBuilder result = new StringBuilder();
			for (int i = 0; i<count;i++) {
				result.append(eligibleIds[i]).append(" ");
				
			}System.out.printf("有錢可借的員工編號: %s共%d 人!%n", result, count);
		}
		}catch (InputMismatchException a) {
            System.out.println("輸入錯誤，請輸入整數。");
            }
		sc.close(); // 關閉 Scanner
		
		
		
		
		
		
//		• 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(提示1：Scanner，陣列)
//		(提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
		
		Scanner sc4 = new Scanner(System.in);

        // 接收年份、月份、日期
        System.out.print("請輸入西元年（yyyy）：");
        int year = sc4.nextInt();
        System.out.print("請輸入月份（mm）：");
        int month = sc4.nextInt();
        System.out.print("請輸入日期（dd）：");
        int day = sc4.nextInt();

        // 定義每個月的天數 (2月根據是否為閏年來決定)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 檢查是否為閏年
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // 閏年 2 月有 29 天
        }

        // 驗證輸入的月份與日期是否正確
        if (month < 1 || month > 12) {
            System.out.println("月份輸入錯誤！");
        } else if (day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("日期輸入錯誤！");
        } else {
            // 計算該日期是該年的第幾天
            int dayOfYear = 0;
            for (int i = 0; i < month - 1; i++) {
                dayOfYear += daysInMonth[i];
            }
            dayOfYear += day;

            // 顯示結果
            System.out.printf("輸入的日期為該年第 %d 天%n", dayOfYear);
        }
        
        sc4.close();
    


		
		
		
		
//		• 班上有8位同學，他們進行了6次考試結果如下：
//		請算出每位同學考最高分的次數
//		(提示：二維陣列)

        int[][] scores = {
                {10, 35, 40, 100, 90, 85, 75, 70},  // 1考
                {37, 75, 77, 89, 64, 75, 70, 95},   // 2考
                {100, 70, 79, 90, 75, 70, 79, 90},  // 3考
                {77, 95, 70, 89, 60, 75, 85, 89},   // 4考
                {98, 70, 89, 90, 75, 90, 89, 90},   // 5考
                {90, 80, 100, 75, 50, 20, 99, 75}   // 6考
            };
        
        //紀錄最高分的
        int[] counters = new int[8];
        
        for (int[] exam:scores) {
        	int maxScore = findMax(exam); //去設計一個函數可以找到最大值
        	for(int i = 0;i<exam.length; i++) {
        		if (exam[i] == maxScore) {
        			counters[i]++;
        		}	
        	}	
        }
        
        for (int i = 0; i < counters.length; i++) {
            System.out.println((i + 1) + "號同學獲得最高分的次數: " + counters[i]);
        }
        
		
	}
    public static int findMax(int[] array){
    	
    	int max = array[0];
    	for (int num:array) {
    		if (num > max) {
                max = num;
            }
    	}
    	return max;
    	
    }
	// 判斷是否為閏年（閏年條件：可被 4 整除且不可被 100 整除，或可被 400 整除）
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
}
