import  java.util.Scanner;
public class TestDemo{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要判断的数");
		int a = scan.nextInt();
		int b;
		for (b = 2; b < a ; b++) {
			if (a % b == 0) {
				System.out.println("不是素数");
				break;
			}
		}
		if (a == b) {
				System.out.println("是素数");
		}
	}
	public static void main1(String[] args) {
		System.out.println(10%3);
		System.out.println(10%-3);
		System.out.println(-10%3);
		System.out.println(-10%-3); 
		//2 2.5 2.5 2.5  1  1  -1  -1
		// int a = 1;
		// boolean flg = true;
		// //a = (int)b;
		// //System.out.println(a);
		// // a = d;
		// // System.out.println(a);
		// a = (int)flg;
		// System.out.println(a);

	}
	// public static void main(String[] args) {
	// 	int a = 10;
	// 	a = 80;
	// 	int c = a+20;
	// 	System.out.println("c的值是：" +c);
	// 	final int b = 20;
	// 	//b = 11;
	// 	int d = b+89;
	// 	System.out.println("d的值是：" +d);
	// }
}