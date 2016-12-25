
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;



public class S {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) {
		// TODO Auto-geneymsterated method stub

		//
		// for(int a=1;a<=7;a++) //a控制行数，一共7行
		// {
		// int c;
		// if (a <= 4) //4行前自增 1 2 3 4
		// c = a * 2 - 1;
		// else
		// c = (8 - a) * 2 - 1; //后3行自减 3 2 1
		// for (int b = 1; b <= c; b++)
		// {
		// System.out.print("* ");
		// }
		// System.out.println();
		// }
		//
		// for (int i = 1; i <= 5; i++) {
		// for(int a=5;a>=i;a--) {
		// System.out.print(" ");
		//
		// }
		// for (int j = 1; j <= i; j++){
		// System.out.print("*");
		// }
		// System.out.println();
		// }
		// 猴子第一天摘下许多桃子，当即吃下一半，还不过瘾又吃了一个，第二天早上有吃了一半，
		// 又多吃了一个，于是每天都这样，到了第十天的早上，只剩下一个桃子了，问一共摘了多少个桃子?

		// int x = 1;//第十天的数量
		// for (int i = 1; i <= 9; i++) {
		// x = (x + 1) * 2;
		
		// }
		// System.out.println("一共you了" + x + "");

		// 打出1-10000水仙花数，一个三位数的每个三次方是该数的本身153=1*1*1+5*5*5+3*3*3

		// for (int i = 1; i <= 10000; i++) {
		// int z = i % 10; // 输出个位
		// int y = i / 10 % 10;// 输出十位数
		// int x1 = i / 100 % 10; // 输出百位数
		//
		//
		// if (x1 * x1 * x1 + y * y * y + z * z * z == i&&i!=1&&i<10000) {
		// System.out.println(i);
		// }
		//

		// }
		// 有1.2.3.4.四个数字，能组成多少个互不相同的3位数，并把它们都输出
		// int count = 0;
		// for (int x2 = 1 ; x2 <= 4; x2++) {
		// for (int y2 = 1; y2 <= 4; y2++) {
		// for (int z2 = 1; z2 <= 4; z2++) {
		// if (x2 != y2 && y2 != z2 && z2 != x2) {
		// count++;
		// System.out.println("一共有" + count + "种方法，组合方式有:" + (x2 * 100 + y2 * 10
		// + z2));
		//
		// }
		// }
		// }
		// }

		// //一个小球从100米落下，反弹为原来的一半，问第十次反弹多高，小球一共运动多少，路径？
		// double sum=0,h=100;
		// for(int i=1;i<=10;i++){
		// sum+=h*2;
		// h=h/2;
		// System.out.println("第"+i+"次弹起的高度为"+h+"");
		//
		// }
		// sum=sum-100;
		// System.out.println("一共运动了"+sum);
		// System.out.println("第十次上升的高度是"+h);

		// Scanner scan=new Scanner(System.in);
		// int month;
		// System.out.print("请输入一个月份");
		// month=scan.nextInt();
		// switch (month){
		// case 12:
		// case 1:
		// case 2:
		// System.out.print("是冬天");
		// break;
		// case 3:
		// case 4:
		// case 5:
		// System.out.print("是春天");
		// break;
		// case 6:
		// case 7:
		// case 8:
		// System.out.print("是夏天");
		// break;
		// case 9:
		// case 10:
		// case 11:
		// System.out.print("是秋天");
		// break;
		// default:
		// System.out.print("你输入得数有问题");
		// }
		//

		// Scanner scan = new Scanner(System.in);// 接收控制台输入的信息
		// System.out.print("请输入一个正整数：");
		//
		// try {
		// int num = scan.nextInt();// 取出控制台输入的信息
		//
		// if (num < 2) {// 若输入的数小于2,输出提示信息
		//
		// System.out.println("必须输入不小于2的正整数！");
		// } else {
		//
		// int primeNumber = 2;// 定义最小的质数
		// System.out.print(num + " = ");
		//
		// while (primeNumber <= num) {// 在质数小于输入的数时，进行循环
		//
		// if (primeNumber == num) {// 当质数等于输入的数时,直接输出
		//
		// System.out.print(num);
		// break;// 跳出循环
		//
		// } else if (num % primeNumber == 0) {// 当输入的数与质数的余数为0时,输出这个质数
		//
		// System.out.print(primeNumber + " * ");
		// num = num / primeNumber;// 把剩下的结果赋给num
		//
		// } else {// 在余数不为0时,质数递增
		// primeNumber++;
		// }
		// }
		// }
		// } catch (Exception e) {
		// System.out.println("必须输入正整数！");// 捕捉异常,输出必须输入整数
		// }
		//
		//
		//

		//
		////
		// int a[] = {0,1,2,3,4,5,6,7,8,9,99};
		// // 取出次数
		// int checkOutCount = (int)(Math.random()*10);
		// // 第几位取出
		// int checkOutIndex;
		// for (int i = 0;i < checkOutCount;i++) {
		// checkOutIndex = (int)(Math.random()*10);
		// System.out.print(a[checkOutIndex]);
		//
		// }
		// 第二种方法
		// int a[] = {0,1,2,3,4,5,6,7,8,9,99};
		// Random r=new Random();
		// int count=r.nextInt(10);
		// int d;
		// for (int i = 0; i < count; i++) {
		// d=r.nextInt(10);
		// System.out.print(a[d]);
		// }

		// Scanner sc=new Scanner(System.in);
		// System.out.println("输入一个三位数");
		// int m=sc.nextInt();
		// int a=m%10;
		// int b=m/10%10;
		// int c=m/100%10;
		// if(m==a*a*a+b*b*b+c*c*c){
		//
		// System.out.println("是水仙花数");
		// }else{
		// System.out.println("不是水仙花数");
		//
		// }
		//
		// 9、程序的功能是:把20个随机数存入一个数组,然后输出该数组中的最大值。
		// 其中确定最大值的下标的操作在fun函数中实现,请给出该函数的定义。

		//

		/**
		 * 3)给定数组元素，如何实现冒泡排序算法？请用程序实现。提示：冒泡排序算法的运作如下：（从后往前）
		 * a.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
		 * b.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一步骤，最后的元素应该会是最大的数。
		 * c.针对所有的元素重复以上的步骤，除了最后一个。 d.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
		 * 
		 * @param args
		 */

		//
		// int [] a = {5,14,2,35,1};
		// int temp = 0;
		// for(int i = 0;i<a.length-1;i++){
		// for(int j = 0;j < a.length-1-i;j++){ //数组下标从0开始
		// if(a[j]>a[j+1]){
		// temp = a[j];
		// a[j] = a[j+1];
		// a[j+1] = temp;
		// }
		// }
		// }
		//
		// for(int x = 0;x<a.length;x++){
		// if(x<a.length-1){
		// System.out.print(a[x]+"<");
		// }else{
		// System.out.print(a[x]);
		//
		//
		//
		// }
		// }

		/*
		 * 阿姆斯特朗数 如果一个正整数等于其各个数字的立方和，则称该数为阿姆斯特朗数(亦称为自恋性数)。 如
		 * 407=43+03+73就是一个阿姆斯特朗数。试编程求1000以内的所有阿姆斯特朗数。 问题分析与算法设计
		 * 可采用穷举法，依次取1000以内的各数(设为i)，将i的各位数字分解后，据阿姆斯特朗数的性质进行计算和判断。
		 */

		//
		// for (int i = 1; i <= 9; i++)//不可以为0
		// for (int j = 0; j <= 9; j++)
		// for (int k = 0; k <= 9; k++)
		// if (i * i * i + j * j * j + k * k * k == i * 100 + j * 10
		// + k)
		// System.out.println(i * 100 + j * 10 + k);
		//
		// for (int i = 100; i < 1000; i++) {
		// int a = i % 10;
		// int b = i / 10 % 10;
		// int c = i / 100 % 10;
		// if (c * 100 + b * 10 + a == a * a * a + b * b * b + c * c * c ) {
		// System.out.print(i+" ");
		// }
		//
		// }

		/*
		 * 歌星大奖赛在歌星大奖赛中，有10个评委为参赛的选手打分，分数为1~100分。
		 * 选手最后得分为：去掉一个最高分和一个最低分后其余8个分数的平均值。 请编写一个程序实现。 问题分析与算法设计提示：这个问题的算法十分简单，
		 * 但是要注意在程序中判断最大、最小值的变量是如何赋值的。
		 */

		// double max,min,ave,sum=0,sum1=0;
		// double[] a=new double[10];
		// Scanner sc=new Scanner(System.in);
		// System.out.println("请输入十组数字分数");
		// for (int i = 0; i < a.length; i++) {
		// a[i]=sc.nextInt();
		// sum+=a[i];
		// }
		// max=a[9];
		// min=a[0];//注意
		// for (int i = 0; i < a.length; i++) {
		// if(a[i]>max){
		// max=a[i];
		// }
		// if(a[i]<min){
		// a[i]=min;
		//
		// }
		//
		// }
		// sum1=sum-max-min;
		// ave=sum1/8;
		// System.out.println(ave);
		//
		//

		// 第一题
		// for (int i = 1; i <= 9; i++) {
		// for (int j = 1; j <=i; j++) {
		// System.out.print(i+"*"+j+"="+(i*j)+"\t");
		// }
		// System.out.println(" ");
		// }
		//

		// 第二题2
		// for (int i = 1; i <=11; i++) {
		// for (int j = 11-i; j >0; j--) {
		// System.out.print(" ");
		// }
		// for (int j = 1; j <=i; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		//
		// }

		// 第三题
		//
		// Scanner sc=new Scanner(System.in);
		// System.out.println("请你输入一个数");
		// int m=sc.nextInt();
		// int jc=1;
		// for (int i = 1; i <=m; i++) {
		// jc*=i;
		// System.out.print(jc);
		// }
		// System.out.println();

		// System.in.read() 返回的是输入数值的 ASKII 码（一个 int 整数）。
		// 如果要求输入与输出的一致的话：通常情况下，你会用readLine( )一行一行地读取输入，
		// 因此要把System.in包装成BufferedReader。
		// 但在这之前还得先用InputSteamReader把System.in转换成Reader。
		// BufferedReader in = new BufferedReader(new
		// InputStreamReader(System.in));
		// int a = Integer.parseInt(in.readLine());//强制转换为需要的类型修改如下：import
		// java.io.BufferedReader;

		//
		// 是缓冲字符输入流，InputStreamReader 是字节流通向字符流的桥梁
		// BufferedReader in=new BufferedReader(new
		// InputStreamReader(System.in));
		//
		// System.out.println("请输入一个数:");
		// int one = Integer.parseInt(in.readLine());//强制转换为需要的类型
		// //int one=System.in.read();你原来的写法，注释掉
		// int sum=1;
		// for(int i=one;i>0;i--){
		// sum*=i;
		// }
		// System.out.println(one+"!"+"="+sum);

		// 第四题1．将输入的百分制成绩转换为五分制成绩输出。
		// 就是转换为ABCDE等级一样

		// double[] score = { 95.3, 34.2, 23.2, 56.2, 67.3, 78.7, 86.0, 93, 84,
		// 71 };
		// // 转换后成绩
		// String[] score1 = new String[score.length];
		// for (int i = 0; i < score.length; i++) {
		// if (score[i] >= 90) {
		// score1[i] = "A";
		// } else if (score[i] > 80 && score[i] <= 89) {
		// score1[i] = "B";
		// } else if (score[i] > 70 && score[i] <= 79) {
		// score1[i] = "C";
		// } else if (score[i] > 60 && score[i] <= 69) {
		// score1[i] = "D";
		// } else {
		// score1[i] = "E";
		// }
		// }
		// // 输出转换后成绩
		// for (int i = 0; i < score1.length; i++) {
		// if(i==score1.length-1){
		// System.out.print(score1[i] );
		// }else{
		// System.out.print(score1[i] + ",");
		// }

		// //第5题．学生成绩管理系统。从键盘输入某班学生某门课的成绩，当输入成绩为负值时，
		// 表示输入结束，输出其平均分，并输出实际输入的学生人数，
		// 输出最高分。并将分数按从高到低顺序进行排序输出。
		// Scanner sc = new Scanner(System.in);
		// int count = 0;
		// double sum = 0;
		// double ave = 0;
		// double[] stu = new double[100];
		// System.out.println("请输入学生的成绩");
		// for (int i = 0; i < stu.length; i++) {
		// stu[i] = sc.nextDouble();// 重
		// if (stu[i] > 0) {
		// sum += stu[i];
		//
		// count++;// z中
		// } else {
		// System.out.println("人数是" + count);
		// ave = sum / count;
		// System.out.println("平均分是" + ave);
		// double temp;
		// for (int j = 0; j <= count - 1; j++) {
		// for (int z = 0; z <= count - j - 1; z++) {
		//
		// if (stu[z] < stu[z + 1]) { // 看
		// temp = stu[z];
		// stu[z] = stu[z + 1];
		// stu[z + 1] = temp;
		// }
		// }
		// }
		// System.out.println("最高分是" + stu[0]);
		// System.out.println("分数从高到底顺序为：");
		// for (int j = 0; j < count; j++) { //看,按人排列
		// System.out.print(stu[j] + " ");
		// }
		// }
		//
		// }

		// 6．模拟骰子的6000次投掷，编程统计并输出骰子的6个面各自出现的概率。
		// int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5
		// = 0;
		// Random r = new Random();
		// for (int i = 1; i <= 6000; i++) {
		//
		// int j =
		// r.nextInt(6)+1;//随机0-5，后加一，1-6，Math.random*100为0-100，Math.random为0-1；
		//
		// if (j == 1) {
		// count++;
		// }
		// if (j == 2) {
		// count1++;
		// }
		// if (j == 3) {
		// count2++;
		// }
		// if (j == 4) {
		// count3++;
		// }
		// if (j == 5) {
		// count4++;
		// }
		// if (j == 6) {
		// count5++;
		//
		// }
		// }
		// System.out.println("第一面出现的概率：" + (double) count / 6000);
		// System.out.println("第二面出现的概率：" + (double) count1 / 6000);
		// System.out.println("第三面出现的概率：" + (double) count2 / 6000);
		// System.out.println("第四面出现的概率：" + (double) count3 / 6000);
		// System.out.println("第五面出现的概率：" + (double) count4 / 6000);
		// System.out.println("第六面出现的概率：" + (double) count5 / 6000);

		// 9．找出1000之内的所有完数，并输出到屏幕上。
		// 所谓“完数”是指一个数如果恰好等于它的因子之和，因子是指能够整除该数的数。如：6=1+2+3。
		// for (int i = 1; i <= 1000; i++) {
		// int sum = 0;// 定义一个存储整数和的,看，不能定义在外面，否则默认为零，没结果
		// for (int j = 1; j < i; j++) { //在定义一个for循环进行查找，j<i
		// if (i % j == 0) {// 判断是否为因子
		// sum += j;// 是的话，加起来放入sum中
		// }
		//
		// }
		// if (i == sum) {// 等于因子之和，输出
		// System.out.println(i);
		// }
		// }

		// 第2种方法:
		// int i, j, sum; // sum用来存放因子之和
		//
		// for (i = 1; i < 9000; i++) { // 对1到1000以内的数依次尝试
		// sum = 0; // 给sum赋值，同时也是对上一次的值清空
		// for (j = 1; j <= i / 2; j++) { // 查找因子
		//
		// if (i % j == 0) {// 如果是因子
		// sum += j; // 把当前的因子累加到sum中
		// }
		//
		// }
		// if (sum == i) // 判断是不是完数，即因子之和等于自身
		// {
		// System.out.print(i+" " ); // 是完数，输出
		// for (j = 1; j <= i / 2; j++) // 再次找出这个完数的因子
		// {
		// if (i % j == 0) // 输出各个因子
		// System.out.print(j + ", ");
		// }
		// System.out.println();
		//
		// }
		//
		// }
		// 7．体型判断问题。医务工作者经广泛的调查和统计分析，根据身高与体重因素给出了下按“体指数”进行体型判断的方法：
		// 体指数t = 体重w/(身高h)2
		// 当t<18时，为低体重；
		// 当t介于18和25之间时，为正常体重；
		// 当t介于25和27之间时，为超重体重；
		// 当t>=27时，为肥胖。
		// 从键盘输入身高h和体重w，根据上述给定的公式计算体指数t，然后判断体重属于何种类型。

		// double t, w, h;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入身高/M！");
		// h = sc.nextDouble();
		// System.out.println("请输入体重/Kg！");
		// w = sc.nextDouble();
		// t = (w / (h*h)); //h*h要加括号
		// System.out.println(t);
		// if (t < 18) {
		// System.out.println("低体重");
		// } else if (t >= 18 && t < 25) {
		// System.out.println("正常体重");
		// } else if (t >= 25 && t < 27) {
		// System.out.println("超重体重");
		// } else if (t >= 27) {
		// System.out.println("肥胖");
		// }
		// 11. 某服装公司为了推销产品，采取这样的批发销售方案:凡订购超过100 套的，
		// 每套定价为50元，否则每套价格为80元。
		// 编程由键盘输入订购套数，输出应付款的金额数。
		//
		// int i=1;
		// Scanner sc=new Scanner(System.in);
		// System.out.println("请输入你要订购的数量");
		// int m=sc.nextInt();
		// if(m>=100){
		// m=m*50;
		// }else{
		// m=m*80;
		// }
		//
		//
		// System.out.println(m+"元");
		//
		//

		// 14.编程实现一模拟进度条
		// for (int i = 0; i <10; i++) {
		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// System.out.print("<");
		// }

		// 15.编程实现求三个数最小值
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入第一个数");
		// int a = sc.nextInt();
		// System.out.println("请输入第二个数");
		// int b = sc.nextInt();
		// System.out.println("请输入第三个数");
		// int c = sc.nextInt();
		//
		// int temp=(a<b)?a:b;
		// int min=(temp<c)?temp:c;
		// System.out.println("三个数的最小值是"+min);
		//
		// （2）
		// Scanner sc=new Scanner(System.in);
		// System.out.println("请输入第一个数");
		// int a = sc.nextInt();
		// System.out.println("请输入第二个数");
		// int b = sc.nextInt();
		// System.out.println("请输入第三个数");
		// int c = sc.nextInt();
		// int min=a;
		// if(a>b){
		// min=b;
		// }
		// if(a>c){
		// min=c;
		// }
		//
		// System.out.println(" 最小值是："+min);

		// 16.编程实现求1到100之间所有7的倍数的和
		// int sum=0;
		// for (int i = 1; i <=100; i++) {
		// if(i%7==0){
		// sum+=i;
		// }
		// }
		// System.out.println("所有7的倍数的和"+sum);

		// 17.(1)编程实现判断某一数字是否是素数，并输出相应提示信息
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入一个数");
		// int m = sc.nextInt();
		// int k = m / 2;
		// int j;
		// for (j = 2; j <= k; j++) {
		// if (m % j == 0) {
		// System.out.println("不是素数");
		// break;
		// }
		//
		// }
		//
		// if (j > k) {
		// System.out.println("是素数");
		// }

		// (2)
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("请你输入一个数"); int
		 * k=sc.nextInt(); int count=0; for (int j = 1; j < k; j++) { int i=2;
		 * while(i<j){ if(j%i==0){ i++; break; } if(j==i){
		 * System.out.println("是素数"); count++;
		 * 
		 * } System.out.println(count); }
		 * 
		 * }
		 */

		// 18.编程实现输入圆的半径，求圆的面积
		// Scanner sc=new Scanner(System.in);
		// System.out.println("请你输入圆的半径");
		// double m=sc.nextDouble();
		// double y=m*m*3.14;
		// System.out.println("圆的面积为："+y);

		// 19.春天是鲜花的季节，水仙花就是其中最迷人的代表，数学上有个水仙花数，他是这样定义的：
		// “水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，比如：153=1^3+5^3+3^3。
		// 现在要求输出所有在100到900范围内的水仙花数。
		// for (int i = 100; i <=999; i++) {
		// int a=i%10;
		// int b=i/10%10;
		// int c=i/100%10;
		// if(i==a*a*a+b*b*b+c*c*c){
		// System.out.println(i);
		// }
		// }

		// 22.如数组元素为1，2，3，4，5，则逆序存放后数组元素的值为5，4，3，2，1。
		// System.out.println("请你输入几个数，且小于10个数");
		// Scanner sc=new Scanner(System.in);
		// int[] a=new int[10];
		// int i;
		// for ( i = 0; i < a.length; i++) {
		// a[i]=sc.nextInt();
		// }
		// for (i = a.length-1; i>=0; i--) {
		// if(i==a.length){
		// System.out.print(a[i]);
		//
		// }else{
		// System.out.print(a[i]+";");
		//
		// }
		//
		// }

		// 20.画出求1!+2!+3!+……+10!的流程图。
		// int sum=0;int jc=1;
		// for (int i = 1; i <=10; i++) {
		// jc*=i;
		// sum+=jc;
		//
		// }
		// System.out.println(sum);

		//
		//
		//
		// 12.画出统计2001到2100之间所有闰年的个数的流程图
		// int count=0;
		// for (int i = 2001; i <2100; i++) {
		// if(i%4==0&&i%100!=0||i%400==0){
		// count++;
		// }
		// }
		// System.out.println(count);
		//

		// System.out.println(2/3); //0
		// System.out.println(2%3); //2
		// System.out.println(12/5); //2

		// 20.求1*2*3*....*10=;
		// int sum=1;
		// for (int i = 1; i <10; i++) {
		// sum*=i;
		//
		//
		// }
		//
		// System.out.println(sum);
		//

		// 23.在一个一维整型数组中找出其中最大的数及其下标的
		//
		// int a[] = new int[4];
		// int x = 0;
		// int max = a[0];
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入数");
		// for (int i = 0; i < a.length; i++) {
		// a[i] = sc.nextInt();
		// }
		//
		// System.out.println();
		// for (int i = 0; i < a.length; i++) {
		//
		// if (max < a[i]) {
		// max = a[i];
		// x = i;
		// }
		//
		// }
		// System.out.println("该数组中的最大值为：" + max + " [" + x + "]");

		// 25.画出输入两个整数,n1,n2(要求n1<n2),统计两整数范围内被3整除的数的个数的流程图

		// Scanner sc = new Scanner(System.in);
		// int count = 0;
		// System.out.println("输入你的第一个数m");
		// int m = sc.nextInt();
		// System.out.println("输入你的第二个数n");
		//
		// int n = sc.nextInt();
		// if (m > n) {
		// System.out.println("请重新输入，m<n");
		// System.exit(0);
		// }else{
		// for (int i = m; i < n; i++) {
		//
		//
		// if (i % 3 == 0) {
		// count++;
		//
		// }
		//
		// }
		//
		// }
		// System.out.println(count);

		// 27.编程实现函数fun实现求一个四位数的各位数字的立方和。再编写main函数，通过键盘

		// Scanner sc = new Scanner(System.in);
		// int m = sc.nextInt();
		// int sum = 0;
		// System.out.println("请输入一个四位数");
		// if(m>999&&m<10000){
		// int a = m % 10;
		// int b = m / 10 % 10;
		// int c = m / 100 % 10;
		// int d = m / 1000 % 10;
		// sum = a * a * a + b * b * b + c * c * c + d * d * d ;
		// System.out.println(sum);
		// }else{
		// System.out.println("请输入一个四位数");
		// }

		//
		// 24.产生25个[50,90]上的随机整数并求出其中能被5整除的所有数的和
		// int sum = 0;
		// int[] a = new int[25];
		// Random ra = new Random();
		// for (int i = 0; i < a.length; i++) {
		// a[i] = ra.nextInt(41) + 50; //0-40再加50是，50到90
		// }
		//
		// for (int i = 0; i < a.length; i++) {
		// if (a[i] % 5 == 0) {
		// sum = sum + a[i];
		// System.out.print(a[i]+" ");
		// }
		// }
		// System.out.println();
		// System.out.println(sum);

		// 28.编写函数fun，功能是求如下表达式：
		//
		// 如：n=5 运行结果：1.666667
		// double sum = 0;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请你输入一个数");
		// int n = sc.nextInt();
		// for (int i = 1; i <= n; i++) { //i要等于1
		// double s = 0;
		//
		// for (int j = 1; j <= i; j++) {
		// s = s + j;
		//
		// }
		// sum = sum + (1.0 / s); //要放对位置，第一个for里面
		// }
		//
		// System.out.println(sum);

		// 32.从键盘为一维整型数组输入10个整数，调用fun函数找出其中最小的数，并在main函数中输出。
		// int[] a=new int[10];
		// int min=0;
		// Scanner sc=new Scanner(System.in);
		// for (int i = 0; i < a.length; i++) {
		// a[i]=sc.nextInt();
		// min=a[0];
		// if(min>a[i]){
		// min=a[i];
		// }
		// }
		// System.out.println(min);
		//

		// 34.编写函数fun，函数的功能是：求一组数中大于平均值的数的和。
		// 例如：给定的一组数为1,3,6,9,4,23,35,67,12,88时，函数值为190。
		// int[] a=new int[5];
		// Scanner sc=new Scanner(System.in);
		// double ave=0;
		// double sum=0;
		// double sum1=0;
		// for (int i = 0; i < a.length; i++) {
		// a[i]=sc.nextInt();
		// sum+=a[i];
		// }
		// ave=sum/a.length;
		// for (int j = 0; j < a.length; j++) {
		// if(a[j]>ave){
		// sum1+=a[j];
		// }
		// }
		//
		// System.out.println(sum1);

		// 36. 对一批货物征收税金。价格在1万元以上的货物征税5%，在5000元以上，1万元以下的货物征税3%，
		// 在1000元以上，5000元以下的货物征税2%，1000元以下的货物免税。编写一程序，读入货物价格，计算并输出税金。
		// Scanner sc=new Scanner(System.in);
		// double m=sc.nextInt();
		// int i=1000;
		// double y=0;
		// if(m<i){
		// y=0;
		// }else{
		// if(m<5000){
		// y=m*0.02;
		// }else if(m<10000){
		// y=m*0.05;
		// }
		//
		// }
		//
		//
		// System.out.println(y);
		//

		// 37.有50个学生，要求将他们之中成绩在80分以上者打印出来，。
		// int[] a = new int[50];
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入");
		// for (int i = 0; i < a.length; i++) {
		// a[i] = sc.nextInt();
		// }
		// for (int i = 0; i < a.length; i++) {
		// if (a[i] >= 80) {
		// System.out.println(a[i]);
		// }
		// }

		// 38.用户输入运算数和四则运算符，输出计算结果。
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入第一个数");
		// double m = sc.nextDouble();
		// System.out.println("请输入第二个数");
		// double n = sc.nextDouble();
		// String choose=" ";
		// System.out.println("请输入你要进行的运算符");
		// choose=sc.next();//用nextline的话，回车键就结束了，不进行下列操作
		// if(choose.equalsIgnoreCase("+")){
		// System.out.println(m+"+"+n+"="+(m+n));
		// }
		// if(choose.equalsIgnoreCase("-")){
		// System.out.println(m+"-"+n+"="+(m-n));
		// }
		// if(choose.equalsIgnoreCase("*")){
		// System.out.println(m+"*"+n+"="+(m*n));
		// }
		// if(choose.equalsIgnoreCase("/")){
		// System.out.println(m+"/"+n+"="+(m/n));
		// }
		// // 39.判别一个整数数组中各元素的值，若大于0则输出该值，若小于等于0则输出0值，
		// （要求：由两个或两个以上函数组成，在主函数中调用另一个函数。）

		// int[] a={1,2,3,-1,-3,33};
		// int y=0;
		// for (int i = 0; i < a.length; i++) {
		// if(a[i]<=0){
		// y=0;
		// }else{
		//
		// y=a[i];
		// }
		// System.out.print(y);
		// }
		//

		//// 40.某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：
		// 每位数字都加上5,然后用和除以10的余数代替该数字，
		//// 再将第一位和第四位交换，第二位和第三位交换。 从键盘输入四位数字，
		//// 输出加密后的数据。
		// int temp;
		// int temp1;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输输入一个四位数");
		// int m = sc.nextInt();
		// int a = (m + 5) % 10;
		// int b = (m / 10 + 5) % 10;
		// int c = (m / 100 + 5) % 10;
		// int d = (m / 1000 + 5) % 10;
		// temp=a;
		// a=d;
		// d=temp;
		// temp1=b;
		// b=c;
		// c=temp1;
		// int result=a+b*10+c*100+d*1000;
		// System.out.println(result);

		// 43.抓交通肇事犯一辆卡车违反交通规则，撞人后逃跑。现场有三人目击事件，
		// 但都没有记住车号，只记下车号的一些特征。甲说：牌照的前两位数字是相同的；
		// 乙说：牌照的后两位数字是相同的，但与前两位不同； 丙是数学家，他说：四位的车号刚好是一个整数的平方。请根据以上线索求出车号。
		// *问题分析与算法设计提示：
		// 按照题目的要求造出一个前两位数相同、后两位数相同且相互间又不同的整数，然后判断该整数是否是另一个整数的平方。
		// int a=0;
		// for (int i = 1; i <=9; i++) {
		// for (int j = 1; j <=9; j++) {
		// if(i!=j){
		// a=i+i*10+j*100+j*1000;
		//
		// }
		// for (int j2 = 31; j2 <100; j2++) {
		// if(a==j2*j2){
		// System.out.println(a);
		// }
		// }
		// }
		// }

		// 44.一个奇异的三位数
		// 一个自然数的七进制表达式是一个三位数，而这个自然数的九进制表示也是一个三位数，且这两个三位数的数码正好相反，求这个三位数。
		// *问题分析与算法设计提示：
		// 根据题意可知，七进制和九进制表示的这全自然数的每一位一定小于7，
		// 可设其七进制数形式为kji(i、j、k的取值分别为1~6)，然后设其九进制表示形式为ijk。
		// int i,j,j2;
		// for ( i = 1; i < 7; i++) {
		// for ( j = 0; j < 7; j++) {
		// for ( j2 = 1; j2 < 7; j2++) {
		// if(i*81+j*9+j2==i+j*7+j2*49){
		// System.out.print(i+j*7+j2*49);
		//
		// }
		//
		//
		// }
		//
		// }
		//
		// }

		// 1．从键盘输入三角形的三条边，判断它们能否构成三角形。若能构成三角形，指出是何种三角形？

		// int a, b, c;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入第一条边");
		// a = sc.nextInt();
		// System.out.println("请输入第二条边");
		// b = sc.nextInt();
		// System.out.println("请输入第三条边");
		// c = sc.nextInt();
		// if ((a + b) > c && (a + c) > b && (b + c) > a && (a - b) < c
		// && (a - c) < b && (b - c) < a) {
		// System.out.println("能构成三角形");
		//
		// if ((a == b || b == c || a == c) && (a != b || b != c || c != a)) {
		// System.out.println("是等腰三角形");
		// }
		// if (a == b && b == c) {
		// System.out.println("是等边三角形");
		// }
		// if (a * a + b * b == c * c || a * a + c * c == b * b
		// || b * b + c * c == a * a)
		// System.out.println("是直角三角形");
		// } else
		// System.out.println("不能构成三角形");
		//

		// 46.百钱百鸡问题
		// 中国古代数学家张丘建在他的《算经》中提出了著名的“百钱买百鸡问题”
		// ：鸡翁一，值钱五，鸡母一，值钱三，鸡雏三，值钱一，百钱买百鸡，问翁、母、雏各几何？
		// *问题分析与算法设计提示：
		// 设鸡翁、鸡母、鸡雏的个数分别为x,y,z，题意给定共100钱要买百鸡，若全买公鸡最多买20只，显然x的值在0~20之间；
		// 同理，y的取值范围在0~33之间，可得到下面的不定方程：
		// 5x+3y+z/3=100
		// x+y+z=100
		// 所以此问题可归结为求这个不定方程的整数解。
		// 由程序设计实现不定方程的求解与手工计算不同。在分析确定方程中未知数变化范围的前提下，
		// 可通过对未知数可变范围的穷举，验证方程在什么情况下成立，从而得到相应的解。

		// int k,k2,l;
		// int count=0;
		// for ( k = 1; k <20; k++) {
		//
		// for ( k2 = 0; k2 < 33; k2++) {
		// for ( l = 1; l < 100; l++) {
		// if((5*k+3*k2+l/3==100)&&(k+k2+l==100)){
		// count++;
		// System.out.println("一共有"+count+"种方法:\t"+k+"\t"+k2+"\t"+l);
		// }
		//
		// }
		//
		// }
		//
		//
		// }
		//
		//
		//
		////
		// 8．身高预测问题。
		// 设faheight为其父母身高，moHeight为其母亲身高，身高预测公式为：
		// 男性成人时身高 =（faheight + moHeight）*0.54cm
		// 女性成人时身高 =（faheight*0.923 + moHeight）/2cm
		// 如果喜爱体育煅练，那么可增加身高2%；如果有良好的卫生饮食习惯，那么增加身高1.5%。
		// 从键盘输入用户的性别，父母身高，是否喜爱体育煅练，是否有良好的饮食习惯等条件，用给定的公式和身高预测方法对身高进行预测。
		// Scanner sc = new Scanner(System.in);
		// double height = 0;
		// System.out.println("请输入父亲身高");
		// double fa = sc.nextDouble();
		// System.out.println("请输入母亲身高");
		// double mo = sc.nextDouble();
		// String choose = "", m = "", w = "";
		// System.out.println("请选择性别：男：m，女：w");
		// choose = sc.next();
		// if (choose.equalsIgnoreCase("m")) {
		//
		// height = (fa + mo) * 0.54;
		//
		// System.out.println("是否喜欢体育，是的话请输入y，任意键不是");
		// choose = sc.next();
		// if (choose.equalsIgnoreCase("y"))
		// height += 0.02;
		//
		// System.out.println("是否有健康饮食，是的话请输入y，任意键不是");
		// choose = sc.next();
		//
		// if (choose.equalsIgnoreCase("y"))
		// height += 0.15;
		//
		// }
		//
		// else if (choose.equalsIgnoreCase("w")) {
		// height = (fa * 0.923 + mo) / 2;
		//
		// System.out.println("是否喜欢体育，是的话请输入y，任意键不是");
		// choose = sc.next();
		// if (choose.equalsIgnoreCase("y"))
		// height += 0.02;
		//
		// System.out.println("是否有健康饮食，是的话请输入y，任意键不是");
		// choose = sc.next();
		// if (choose.equalsIgnoreCase("w"))
		// height += 0.15;
		//
		// }
		//
		// System.out.println(height);

		// 42.中国有句俗语叫“三天打鱼两天晒网”。某人从1990年1月1日起开始“三天打鱼两天晒网”，
		// 问这个人在以后的某一天中是“打鱼”还是“晒网”。
		// *问题分析与算法设计提示：
		// 根据题意可以将解题过程分为三步：
		// 1)计算从1990年1月1日开始至指定日期共有多少天；
		// 2)由于“打鱼”和“晒网”的周期为5天，所以将计算出的天数用5去除；
		// 3)根据余数判断他是在“打鱼”还是在“晒网”；
		// 若 余数为1，2，3，则他是在“打鱼”
		// 否则 是在“晒网”
		// 在这三步中，关键是第一步。求从1990年1月1日至指定日期有多少天，要判断经历年份中是否有闰年，二月为29天，平年为28天。
		// 闰年的方法可以用伪语句描述如下：
		// 如果 ((年能被4除尽 且 不能被100除尽)或 能被400除尽)
		// 则 该年是闰年；
		// 否则 不是闰年。
		// JAVA语言中判断能否整除可以使用求余运算(即求模)
		//

		// int a[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// 为平年
		// int b[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };//
		// 定义数组存储年份，闰年
		// int year = 0, month = 0, day1 = 0, day2 = 0, day3 = 0;
		// int count = 0;// 记录有多少年
		// int left = 0;
		// Scanner scan = new Scanner(System.in);
		// System.out.println("请输入年份");
		// year = scan.nextInt();
		// System.out.println("请输入月份");
		// month = scan.nextInt();
		// System.out.println("请输入日");
		// day1 = scan.nextInt();
		//
		// for (int i = 1990; i < year; i++) {// 算出一共有多少年份
		// if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
		// count++;// 算出来润年多少个
		// }
		// }
		//
		// left = year - 1990 - count;// 平年的个数
		// if (month == 1) {
		// day3 = left * 365 + count * 366 + day1 - 1;//1990/1/2,一月份减去1
		// }
		// if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {// 判断润年
		// for (int i = 0; i < month - 1; i++) {// 7月23日，前6个月都是满一个月的
		// day2 = day2 + b[i];// 累加前面所有月份的天数
		// }
		//
		// } else
		// // 非闰年
		// for (int i = 0; i < month - 1; i++) {// 同上
		// day2 = day2 + a[i];
		// }
		// day3 = left * 365 + count * 366 + day2 + day1;// 计算总天数
		// System.out.println("总天数为：" + day3);//
		// if (day3 % 5 == 1 || day3 % 5 == 2 || day3 % 5 == 3) {// 判断是打渔还是晒网
		// System.out.println("正在打渔……");
		// } else
		// System.out.println("正在晒网……");
		//
		//

		//
		// System.out.println(7%4);
		// System.out.println(4%5);//分子小于分母整除余都是分子，除非分子大于分母
		// System.out.println(4/7);
		//
		// Scanner sc = new Scanner(System.in);
		// double r = sc.nextDouble();
		// double s=3.14;
		// double x = r * r * s;
		// DecimalFormat df = new DecimalFormat();
		// df.setRoundingMode(RoundingMode.HALF_UP);//四舍五入
		// df.setMaximumFractionDigits(3);//设置小数点最大的位数是3
		// df.setMinimumFractionDigits(2);//设置小数点最小的位数是2
		// System.out.println(df.format(x));

	}

}
