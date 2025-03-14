package hw2;

public class TestNineNine {
	public static void main(String[] args) {
		
//		一：使用for迴圈+ while迴圈
		int i,j ;
		for( i=1; i<=9; i++) {
			 j = 1;
			while( j<=9) {
				int pro = i*j;
				System.out.print(i+"*"+j+"="+pro+"\t");
				j++;
			}
			System.out.println();
			
		}
		System.out.println("=============================================================");
//		二：使用for迴圈+ do while迴圈
		for( i=1; i<=9; i++) {
			 j = 1;
			do {
				int pro = i*j;
				System.out.print(i+"*"+j+"="+pro+"\t");
				j++;
			}while( j<=9);
			System.out.println();
		}
		System.out.println("=============================================================");
//		三：使用while迴圈+ do while迴圈
		i = 1;
		while(i<=9) {	
			j = 1;
			while( j<=9) {
				int pro = i*j;
				System.out.print(i+"*"+j+"="+pro+"\t");
				j++;
			}
			System.out.println();
			i++;
		}	
	}
}
