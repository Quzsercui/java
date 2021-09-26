import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by czz
 * Description:
 * User: 旧鹿麋
 * Date: 2021-08-27
 * Time: 19:20
 */
public class homework {
    /*
    第十五题
     */
        public static int factorial(int n){
            if(n == 1){
                return 1;
            }
            else{
                return n*factorial(n-1);
            }
        }
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入数字:");
            int num = scanner.nextInt();
            int ret = factorial(num);
            System.out.println(num+"的阶乘为"+ret);
        }
    /*
    第十四题
     */
    public static void main14(String[] args) {
        int num=10;
        System.out.println(add(num));
    }

    public static int add(int num){
        if(num == 1){
            return 1;
        }else{
            return num +add(num - 1);
        }
    }
    /*
    第十三题
     */
    public static void main13(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(num+"的各数字：");
        print(num);
    }
    public static void print(int n){
        if(n>9){
            print(n/10);
        }
        System.out.print(n%10+"  ");
    }
    /*
    第十二题
     */
    public static void main12(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(num+"的各数字之和："+sum(num));
    }
    public static int sum(int n){
        if(n<10){
            return n;
        }
        else {
            return n%10+sum(n/10);
        }
    }
    /*
    十一题
     */
    public static int fib2(int n){
        if(n==1||n==2){
            return 1;
        }
        else {
            return fib2(n-1)+fib2(n-2);
        }
    }
    public static void main11(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("第"+n+"个斐波那契数是："+fib2(n));
    }
    /**
     * 青蛙跳台阶
     *第十题
     */
    public static int jumpfloor(int foot) {
        if (foot == 1)
            return 1;
        if (foot == 2)
            return 2;
        else
            return jumpfloor(foot - 1) + jumpfloor(foot - 2);
    }

    public static void main10(String[] args) {
        System.out.println("青蛙跳台阶:" + jumpfloor(5));
    }

    /**
     * 汉诺塔
     *第九题
     */
    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static  void hanoiTower(int n,char pos1,char pos2,char pos3) {
        if(n==1){
            move(pos1,pos3);
        }else{
            hanoiTower(n-1,pos1,pos3,pos2);//n-1个从pos1借助pos3移到pos2
            move(pos1,pos3);
            hanoiTower(n-1,pos2,pos1,pos3);//n-1个从pos2借助pos1移到pos3
        }
    }
    public static void main9(String[] args) {
        hanoiTower(3, 'A', 'B', 'C');
        System.out.println();
        hanoiTower(4, 'A', 'B', 'C');
        System.out.println();
        hanoiTower(5, 'A', 'B', 'C');
    }

    /**
     *在同一个类中,分别定义求两个整数和的方法 和 三个小数之和的方法。
     *第八题
     */
    public static void main8(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a1=sc.nextInt();
        System.out.print("请输入第二个整数：");
        int a2=sc.nextInt();
        System.out.print("请输入第一个小数：");
        double b1=sc.nextDouble();
        System.out.print("请输入第二个小数：");
        double b2=sc.nextDouble();
        System.out.print("请输入第三个小数：");
        double b3=sc.nextDouble();
        System.out.println("整数和："+sum(a1,a2));
        System.out.println("小数和："+sum(b1,b2,b3));
    }
    private static int sum(int a1, int a2) {
        return a1+a2;
    }

    private static double sum(double a1, double a2,double a3) {
        return a1+a2+a3;
    }
    /**
     * 要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
     * 第七题
     */
    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int intmax=nummax(a,b);
        System.out.println("两个整数的最大值为："+intmax);

        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double doublemax=nummax(a2,b2);
        System.out.println("两个小数的最大值为："+doublemax);

        double a3 = sc.nextDouble();
        double b3 = sc.nextDouble();
        int c = sc.nextInt();
        nummax(a3,b3,c);
    }
    public static int nummax(int a ,int b){
        int Max =a;
        if(b>Max){
            Max=b;
        }
        return Max;
    }
    public static double nummax(double a ,double b){
        double Max =a;
        if(b>Max){
            Max=b;
        }
        return Max;
    }
    public static double nummax(double a ,double b,int c){
        double ret = a>b?a:b;
        double max = ret>c?ret:c;
        double set = a<b?a:b;
        double min = set<c?set:c;
        double mid = ret<c?ret:c;
        System.out.println("大小关系："+max+">"+mid+">"+min);
        return 0;
    }
    /**
     * 求最大值
     * 第六题
     */
    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = max3(a, b, c);
        System.out.println("三者中最大值为：" + max);
    }

    public static int max2(int a, int b) {
        int max = a;
        if (max < b) {
            max = b;
        }
        return max;
    }

    public static int max3(int a, int b, int c) {
        int max = max2(a, b);
        if (max < c) {
            max = c;
        }
        return max;
    }

    /**
     * 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
     * 第五题
     */
    public static void main5(String[] args) {
        int[] arr={1,4,3,2,8,6,7};
        int tmp=1;
        for (int i = 0; i < arr.length-1; i++) {
            boolean flg=false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]%2==0){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    flg=true;
                }
            }
            if(flg==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 求1！+2！+3！+4！+........+n!的和
     * 第三题
     */
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n = scanner.nextInt();
        System.out.println(n+"个数阶乘和为："+sumFuc(n));
    }

    public static int sumFuc(int n) {
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            int ret=1;
            for (int j = 1; j <=i ; j++) {
                ret*=j;
            }
            sum+=ret;
        }
        return sum;
    }
    /**
     * 求斐波那契数列的第n项。(迭代实现)
     * 第二题
     */
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n = scanner.nextInt();
        System.out.println("第"+n+"个斐波那契数为："+fib2(n));
        }
    public static int fib1(int n){
        int sum=0;
        if(n==1||n==2){
            sum=1;
        }
        else{
            int a=1;
            int b=1;
            for (int i = 3; i <=n ; i++) {
                sum=a+b;
                a=b;
                b=sum;
            }
        }
        return sum;
    }

    /**
     * 找出出现一次的数字
     * 第一题
     */
    public static void main1(String[] args) {
        int[] arr={1,2,2,3,3,5,5,5};
        find(arr);
    }
    public static void find(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}
