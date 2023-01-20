package 연습.javaFestival;

import java.util.Scanner;

public class ex03_0109 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 금액 입력: ");
        int money = sc.nextInt();

        int kw10000 = money/10000;
        int kw5000  = money%10000/5000;
        int kw1000  = money%5000/1000;
        int kw500   = money%1000/500;
        int kw100   = money%500/100;

        System.out.println("잔돈:"+money);
        System.out.println("10000원 :"+kw10000);
        System.out.println("5000원 :"+kw5000);
        System.out.println("1000원 :"+kw1000);
        System.out.println("500원 :"+kw500);
        System.out.println("100원 :"+kw100);
        sc.close();
        

        
    }
    
}
