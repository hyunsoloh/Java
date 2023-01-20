package 연습.javaFestival;

import java.util.Scanner;

public class ex02_0109 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("일한시간을 입력하세요: ");
        int time = sc.nextInt();
        int money = 5000;
        
        //조건문 이용

        // if(time>8){
        //     double pay = money*8 + money*(time-8)*1.5;
        //     System.out.println("총 임금은"+(int)pay+"원 입니다.");
        // }else{
        //     double pay = money * time;
        //     System.out.println("총 임금은"+(int)pay+"원 입니다.");
        // }

        //삼항연산자

        double pay = time>8?money*8+ money*(time-8)*1.5: money * time;
        System.out.println("총 임금은"+pay+"원 입니다.");
        sc.close();
    }
    
}
