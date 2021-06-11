import java.util.*;
public class TestDemo {
    //写一个函数返回参数二进制中 1 的个数
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
          for (int i = 0;i < 32;i ++ ) {
                 if (((num >>> i) & 1) != 0) {
                     count ++;
                 }
             }
             System.out.println(count);   
    }
    public static void main9(String[] args) {
        // 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，
        // 提示“登录成功”,密码错误， 可以重新输入，最多输入三次。三次均错，
        // 则提示退出程序
        int a;
        Scanner scan = new Scanner(System.in);
        for (a = 3;a > 0;a--) {
            int count = a-1;
            System.out.println("请输入你的密码");
            String str = scan.next();
            if ("123abc".equals(str)) {
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("密码错误，你还有"+count+"次机会");
            }
        }
        if(a == 0){
                System.out.println("输出密码次数超过上限，程序退出");
        }

    }
    public static void main8(String[] args) {
        //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位
        //数字的立方和确好等于该数本身，如；153＝1＋5＋3?
        int b,c,d;
        for (int a = 0;a <= 999;a++) {
            b = a/100;//百位上的数字
            c = a/10 % 10;//十位上的数字
            d = a % 10;//个位上的数字
            if (a == b*b*b+c*c*c+d*d*d) {
                System.out.println(a);
            }
        }
    }
    public static void main7(String[] args) {
        // 编写程序数一下 1到 100 的所有整数中出现多少个数字9
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int a = 1;a <= 100;a++) {
            if (a%10 == 9) {
                sum1 += 1;//1-100个位数上的9的个数
            }if (a/10 == 9) {
                sum2 +=1;//1-100十位上的9的个数
            }
        }
        sum = sum1+sum2;
        System.out.println(sum);
    }
    public static void main6(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        double a = 1;
        double b = 2;
        double c;
        double d;
        double sum1 = 0;
        double sum2 = 0;
        double from;
        while (a <= 100) {
            c = 1/a;
            sum1 += c;
            a += 2;
        }
        while (b <= 100) {
            d = 1/b;
            sum2 += d;
            b +=2;
        }
        from = sum1-sum2;
        System.out.println(from);
    }
    public static void main5(String[] args) {
        //求两个正整数的最大公约数
        Scanner scan = new Scanner(System.in);
        System.out.println("请您输入要求的最大公约数的两个数字");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a < b ? a : b;
        while (c > 0) {
            if (a % c == 0 && b % c == 0) {
                System.out.println(c);
                break;
            }
            c--;
        }
    }
    public static void main4(String[] args) {
        //输出乘法口诀表
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
    public static void main3(String[] args) {
        //输出 1000 - 2000 之间所有的闰年
        for (int d = 1000;d <= 2000;d++) {
            if (d % 100 == 0 && d % 400 == 0) {
                System.out.println(d);
            }if (d % 4 == 0 && d % 100 != 0) {
                System.out.println(d);
            }
        }
    }
    public static void main2(String[] args) {
        //输出1-100之间所有的素数
        int a;
        for (int i = 1;i <=100;i++) {
            for (a = 2;a < i;a++) {
                if (i % a == 0) {
                    break;
                }
            }if (i == a) {
                System.out.println(i);
            }
        }
    }
    public static void main1(String[] args) {
        //键盘录入一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a = sc.nextInt();
        //判断是否为素数
        if(a == 1){
            System.out.println(a+"不是素数");
        }else {
        for (int i = 2; i <= a; i++) {
            if(a % i == 0){
                int b = i;
                if (b == a) {
                    System.out.println(a+"是素数");
                    break;
                }else{
                    System.out.println("不是素数");
                    break;
                }
            }        
          }
        }    
    }
}