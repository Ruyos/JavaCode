package JavaCode;

import java.util.Scanner;                         //引入Scanner类
public class MyClass{
    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);  //定义体重
        System.out.println("请输入你的体重KG");
        double W = weight.nextDouble();
        Scanner high = new Scanner(System.in);   //定义身高
        System.out.println("请输入你的身高M");
        double H = high.nextDouble();
        double BIM = W/(H*H);                    //输出BIM
        System.out.println("您的BIM是="+BIM);
        if (BIM > 35){                          //使用if...else if...else 语句
            System.out.println("重度肥胖");
        } else if (30 <=BIM & BIM < 35) {       //使用“与”分开运算，忘记的话可以查询（与，或，非，异或，短路与，短路或）
            System.out.println("中度肥胖");
        } else if (27 <=BIM & BIM < 30) {
            System.out.println("轻度肥胖");
        } else if (24 <=BIM & BIM < 27) {
            System.out.println("体重过重");
        } else if (18.5 <= BIM & BIM < 24) {
            System.out.println("正常范围");
        } else if(BIM < 18.5) {
            System.out.println("体重过轻");
        }
    }
}