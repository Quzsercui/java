import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by czz
 * Description:
 * User: 旧鹿麋
 * Date: 2021-08-09
 * Time: 22:17
 */

public class homework {

    /**
     * 第一题 编写程序数一下 1到 100 的所有整数中出现多少个数字9
     */

    public static void main(String[] args) {
        int i=1;
        int count=0;
        for(i=1;i<=100;i++){
            if(i%10==9){
                count++;
            }//个位数
            if(i/10==9) {
                count++;
            }//十位数
        }
        System.out.println(count);
    }
    /**
     * 第二题 输出 1000 - 2000 之间所有的闰年
     */
    public static void main2(String[] args) {
        int i=1;
        for(i=1000;i<=2000;i++){
            if(i%4==0&&i%100!=0){
                System.out.println(i+"是普通闰年");
            }
            else if(i%400==0)
                System.out.println(i+"是世纪闰年");
        }
    }
    /**
     * 第三题 打印 1 - 100 之间所有的素数
     */
    public static void main3(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int i=2;
        int j=1;
        for(i=2;i>1&&i<=100;i++){
            for (j=2;j<=i;j++){
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.println(i);
        }
    }
    /**
     * 第四题 给定一个数字，判定一个数字是否是素数
     */
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = scanner.nextInt();
        for (int i=2;i <= Math.sqrt(num);i++) {    //优化，把范围控制在2-根号之间，Math.sqrt是开平方。
            if(num%i==0) {
                System.out.println(num + "不是素数");
                break;
            }
             else {
                System.out.println(num + "是素数");
                break;
            }
        }
    }

    /**
     * 第五题 年龄打印
     */
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int year = scanner.nextInt();
        if (year <= 18)
            System.out.println("你是少年");
        else if (19 <= year && year <= 28)
            System.out.println("你是青年");
        else if (29 <= year && year <= 55)
            System.out.println("你是中年");
        else
            System.out.println("你是老年");
    }

    /**
     * 第六题 打印 X 图形
     * @param args
     */
    public static void main6(String[] args) {
        int i=1;
        int j=1;
        Scanner scanner=new Scanner(System.in);
        while(true) {

            int n= scanner.nextInt();
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    if (i == j)
                        System.out.print("*");
                    else if (j == n - i + 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
    /**
     * 第七题 猜数字游戏
     */
    public static void main7(String[] args) {
        Random random = new Random();
        int rand= random.nextInt(100)+1;//[0-100]+1 -> [1-101]
        while(true){
            System.out.println("请输入猜的数字：");
            Scanner scanner=new Scanner(System.in);
            int num=scanner.nextInt();
            if(num>rand){
                System.out.println("猜大了");
            }else if(num<rand){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }
    /**
     * 第八题 水仙花数
     */
    public static void main8(String[] args) {
        int i=1;
        int n=999;//n:0-999999
//        for(i=0;i<=999;i++){
//            if(i>=100) {
//                int a = i / 100;
//                int b = (i % 100) / 10;
//                int c = i % 10;
//                int sum = a * a * a + b * b * b + c * c * c;
//                if (i == sum)
//                    System.out.println(i + "是水仙花数");
//            }
//            else if(i>=10&&i<100){
//                int a = i / 10;
//                int b = i % 10;
//                if (i == a*a + b*b){
//                    System.out.println(i + "是水仙花数");
//                }
//            }
//            else
//                System.out.println(i + "是水仙花数");
//
//        }
        //优化算法
        for(i = 0;i <= n;i++) {
            int sum = 0;
            int count = 0;
            int tmp = i;
            //1、求当前数字是几位数
            while (tmp != 0) {
                count++;//3
                tmp /= 10;//123/10=12    12/10=1   1/10=0
            }
            //i = 123  tmp=0
            //得到当前数字的每一位
            tmp = i;//123
            while (tmp != 0) {
                sum += Math.pow(tmp%10,count);//1、安住ctr 鼠标左键 2.
                tmp = tmp/10;//123/10=12
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }
    /**
     * 第九题 计算分数的值 。
     */
    public static void main9(String[] args) {
        int i=1;
        double sum=0;
        while(i<=100){
            if(i%2==0)
                sum = sum + (i / -1.0);
            else{
                sum+=1.0/i;
            }
            i++;
        }
        System.out.println(sum);
    }
    /**
     * 第十题 求两个正整数的最大公约数
     */
    public static void main10(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int c=0;
        System.out.println("请输入两个数：");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        while(a%b!=0){
            c=a%b;
            a=b;
            b=c;
        }
        System.out.println("这两个数的最大公约数是："+b);
    }

    /**
     *第十一题  求一个整数，在内存当中存储时，二进制1的个数。
     */
    public static void main11(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int count=0;
        while(num!=0){
            if((num&1)==1) {
                count++;
            }
            num>>=1;
        }
        System.out.println(count);
    }
    /**
     * 第十二题 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
     */
    public static void main12(String[] args) {
        System.out.println("请输入一个数:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int flag=0;
        int i=0;
        System.out.println("奇数位是：");
        for(i=30;i>=0;i-=2){
            flag=((num>>i)&1);
            System.out.print(flag);
        }
        System.out.println();
        System.out.println("偶数位是：");
        for(i=31;i>=2;i-=2) {
            flag = ((num >> i) & 1);
            System.out.print(flag);
        }
    }
    /**
     * 十三题 模拟登陆(登陆三次)
     */
    public static void main13(String[] args) {
        int count=3;
        while(count!=0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入密码：");
            String key = scanner.nextLine();
            if(key.equals("kobe")){   //字符串变量名.equals("字符串")用于比较字符串。
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("密码错误！");
                count--;
                System.out.println("你还有"+count+"次机会");
            }
        }
        if(count==0)
            System.out.println("密码错误！退出程序");


    }
    /**
     * 第十四题 输出一个整数的每一位
     */
    public static void main14(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个数：");
        int num=scanner.nextInt();
        System.out.println("这个数的每一位：");
        password(num);

    }
    public static void password(int a){
        if(a!=0){
            password(a/10);
            System.out.print(a%10+" ");

        }

    }
    /**
     * 第十五题 输出n*n的乘法口诀表，n由用户输入
     */
    public static void main15(String[] args) {
        int i=1;
        int j=1;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" "+i+"*"+j+"="+(i*j));
            }
            System.out.println();
        }
    }

}


