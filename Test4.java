public class Test4 {
    public static void main(String[] args) {
        for (int i = 1;i < 10;i++) {
            for (int j = i;j < 10;j++) {
                int mul = i*j;
                if(mul <= 9){
                    System.out.print(i+"*"+j+"="+mul+"   ");
                }else{
                    System.out.print(i+"*"+j+"="+mul+"  ");
                }

            }
            System.out.println();
        }
    }
}
