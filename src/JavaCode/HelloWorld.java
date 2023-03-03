package JavaCode;/*
借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期
 */
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Random r = new Random();
        int year = 1995;
        int month = r.nextInt(12) + 1;
        int day = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = r.nextInt(31) + 1;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = r.nextInt(30) + 1;
                break;
            case 2:
                day = r.nextInt(28) + 1;
                break;
        }
        int hour = r.nextInt(24);
        int minute = r.nextInt(60);
        int second = r.nextInt(60);
        System.out.println(year + "年" + month + "月" + day + "日" + hour + "时" + minute + "分" + second + "秒");
    }
}
