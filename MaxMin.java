public class MaxMin{
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 12;
		int max;
		int min;
		if (a > b) {
			max = a;
			min = b;
		}else{
			max = b;
			min = a;
		}if (c > max) {
			max = c;	
		}else if (c < min) {
			min = c;
		}
		
		 System.out.println("最大值=" +max);
		 System.out.println("最小值=" +min);
	}
}