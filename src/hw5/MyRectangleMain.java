package hw5;

public class MyRectangleMain {
//  • 請另外建立一個MyRectangleMain類別，此類別只有main方法
//	(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//	(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
	public static void main(String[] args) {
		
		MyRectangle myr1 = new MyRectangle();
		myr1.setWidth(10);
		myr1.setDepth(20);
		myr1.getArea();
		
		MyRectangle myr2 = new MyRectangle(10,20);
		myr2.getArea();
	}
}
