package hw5;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
//		• 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//		圖：
		Scanner sc = new Scanner(System.in);

        // 接收年份、月份、日期
        System.out.println("請輸入寬與高：");
        System.out.print(">>>");
        int width = sc.nextInt();
        int height  = sc.nextInt();
        Hw5_fun hw = new Hw5_fun();
		hw.starSquare( width, height);
		
		sc.close();
//		• 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
		
		 
		hw.randAvg();
		
		
//		• 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//		可以找出二維陣列的最大值並回傳，如圖：
		
		int[][] intArray = {
		        {1, 2, 3},
		        {4, 5, 6},
		        {7, 8, 9}
		    };
		    
		double[][] doubleArray = {
		        {1.1, 2.2, 3.3},
		        {4.4, 5.5, 6.6},
		        {7.7, 8.8, 9.9}
		    };
		    
		    // 调用重载的方法
		System.out.println();
		System.out.println("Integer Array Max: " + hw.maxElement(intArray));
		System.out.println("Double Array Max: " + hw.maxElement(doubleArray));
		
		
		
//		• 請設計一個類別MyRectangle：
//		(1) 有兩個double型態的屬性為width, depth
//		(2) 有三個方法：
//		void setWidth(double width): 將收到的引數指定給width屬性
//		void setDepth(double depth): 將收到的引數指定給depth屬性
//		double getArea(): 能計算該長方形的面積
//		(3) 有兩個建構子：
//		public MyRectangle(): 不帶參數也無內容的建構子
//		public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性

		MyRectangle myr1 = new MyRectangle(3.3, 4.4);
		
		double Area = myr1.getArea();
		System.out.println("面積為："+ Area);
		
//      • 請另外建立一個MyRectangleMain類別，此類別只有main方法
//		(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//		(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
		
		
		
		
		
//		•身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//		genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//		與數字的亂數組合，如圖：
		
		// 生成並印出驗證碼
        String authCode = Hw5_fun.genAuthCode();
        System.out.println("生成的驗證碼：" + authCode);
		
		
	}
}
