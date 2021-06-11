import  java.util.Scanner;
public class TestDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要求的最大公约数的两个数");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a%b;
		while (c != 0) {
			a = b;
			b = c;
			c = a%b;
		}
		System.out.println(b);
	}
	public static void main16(String[] args) {
		 int i,j;
        int pro;
        for (i = 1;i <= 9;i ++) {
            for (j = 1;j <= i;j ++) {
                pro = i * j;
                System.out.print(i+"*"+j +"="+pro+ "  " );
            }
            System.out.println("\n");
        }
	}
	public static void main15(String[] args) {
		
	}
	public static void main14(String[] args) {
	//打印 1 - 100 之间所有的素数
        for (int i = 2; i <= 100; i++) {
        	int a;
         	for (a = 2; a <= i ; a++) {
         		if (i % a == 0) {
         			break;
       			}
       		}
       		if (a == i) {
         		System.out.println(i);
         	}
         } 	
	
	}
	public static void main13(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要判断的数字");
		int a = scan.nextInt();
		if (a == 1) {
			System.out.println("不属于素数");
		}else {
			for (int i = 2;i <= a;i ++ ) {
				if (a % i == 0) {
					int b = i;
					if (b == a) {
						System.out.println("是素数");
						break;
					}else {
						System.out.println("不是素数");
						break;
					}
				}
			}
		}
	}
	public static void main12(String[] args) {
	//根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
		Scanner  scan = new Scanner(System.in);
		System.out.println("请输入你的年龄");
		int age = scan.nextInt();
		if (age <=18) {
			System.out.println("少年");		
		}else if (age >18 && age <29) {
			System.out.println("青年");
		}else if (age >= 56) {
			System.out.println("老年");
		}else {
			System.out.println("中年");
		}

	}
	public static void main11(String[] args) {
		//1-10之间所有能整除3的数
		int i = 1;
		while (i <= 10) {
			if (i % 3 != 0) {
				i ++;
				continue;
			}
			System.out.println(i);
			i ++;
			
		}
	}
	public static void main10(String[] args) {
		//100-200之间第一个能整除3的数
		int d = 100;
		while (d <= 200) {
			if (d % 3 == 0) {
				System.out.println(d);
				break;
			}
			d ++;
		}
	}
	public static void main9(String[] args) {
		int num = 1; 
		int result6 = 0;
		while (num <= 5) {
		int ret2 = 1;
		int result7 = 1;
		    while (ret2 <= num) {
		    	result7 *= ret2;
			      ret2 ++;
		    }
		result6 += result7;
		num ++;

		}
		System.out.println(result6);
		
	}
	public static void main8(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = 1;
		int ret = 1;
		int result5 = 0;
		while (d <= 5) {
			ret *= d;
			result5 += ret;
			d ++;
		}
		System.out.println(result5);
	}
	public static void main7(String[] args) {
		int num1 = 0;
		int result3 = 0;
		int result4 = 0;
		while (num1 <= 100) {
			if (num1 % 2 == 0) {
				result3 += num1;
			}else {
				result4 += num1;
			}
			num1 ++;
		}
		System.out.println("1-100之间所有偶数的和是" +result3);
		System.out.println("1-100之间所有奇数的和是" +result4);
	}
	public static void main6(String[] args) {
		//计算1-100之间所有奇数的和
		int b = 1;
		int result2 = 0;
		while (b <=100) {
			result2 += b;
			b += 2;
		}
		System.out.println(result2);
	}
	public static void main5(String[] args) {
		//计算1-100之间所有偶数的和
		int a = 2;
		int result1 = 0;
		while (a <= 100) {
			result1 += a;
			a += 2;			
		}
		System.out.println(result1);
	}
	public static void main4(String[] args) {
		//计算1-100之间的所有数的和
		int i = 1;
		int result = 0;
		while (i < 101) {
			result += i;
            i ++; 
		}
		System.out.println(result);
	}
	public static void main3(String[] args) {
		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			num ++;	
		}

	}
	public static void main2(String[] args) {
	//int num = 201;
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();//输入一个整型
	if(num > 0){ 
		System.out.println("该数是正数");
	}else if(num < 0){
		System.out.println("该数是负数");
	}else {
		System.out.println("0");
	}	
	}
}