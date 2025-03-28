package hw5;

import java.util.Random;

import hw4.Hw4;

public class Hw5_fun {
//	• 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//	圖：	
	public void starSquare(int width, int height){
		for(int i=0 ; i<height ; i++) {
			for(int j=0 ; j<width ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
//	• 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
	public void randAvg() {
		int random[]= new int[10];
		for(int i = 0; i <10 ;i++) {
			random[i] = (int) (Math.random() * 101);
		}
		int sum = 0;
	    for(int i = 0; i < 10; i++) {
	        sum += random[i];
	        // 印出每個隨機數
	        System.out.print(random[i] + " ");
	    }
	 // 計算並印出平均值
	    double avg = (double) sum / 10;
	    System.out.printf("\n平均值: %.2f", avg);
	}
	
	
//	• 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳，如圖：	
	
	public int maxElement(int x[][]) {
		 // 初始化最大值为最小可能值
	    int max = Integer.MIN_VALUE;
		
		for(int row[]:x) {
			int rowMax = Hw4.findMax(row);
			// 更新全局最大值
	        if(rowMax > max) {
	            max = rowMax;
	        }
		}
		// 返回找到的最大值
	    return max;
		
	}
	
	public double maxElement(double x[][]) {
	    
	    double max = Integer.MIN_VALUE;
	    
	    
	    for(double[] row : x) {
	        double rowMax = Hw4.findMax(row);
	        // 更新全局最大值
	        if(rowMax > max) {
	            max = rowMax;
	        }
	    }
	 // 返回找到的最大值
	    return max;
	}
	
	
//	•身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	與數字的亂數組合，如圖：
	
	public static String genAuthCode() {
        // 定義可用字元
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        
        // 組合所有可用字元
        String allCharacters = uppercaseLetters + lowercaseLetters + numbers;
        
        // 使用 StringBuilder 來建立驗證碼
        StringBuilder authCode = new StringBuilder();
        
        // 使用 Random 生成隨機索引
        Random random = new Random();
        
        // 生成8位數的驗證碼
        for (int i = 0; i < 8; i++) {
            // 從所有可用字元中隨機選擇一個
            char randomChar = allCharacters.charAt(random.nextInt(allCharacters.length()));
            authCode.append(randomChar);
        }
        
        return authCode.toString();
    }
	
	
	
}
