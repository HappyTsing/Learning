package CH03;

import java.util.Scanner;

/**
 * 计算退休年龄，假设一个人赚到100元就退休，每年赚3元
 */
public class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("入职年龄");
        int age_in = in.nextInt();
        int sum=0,age_out=age_in;
        while(sum < 100) {
            sum+=3;
            age_out+=1;
        }

//        System.out.println("退休年龄："+age_out);
        System.out.printf("退休年龄:%d",age_out);
    }
}
