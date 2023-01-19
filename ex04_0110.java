package 연습.javaFestival;

import java.util.Scanner;

public class ex04_0110 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.print("현제몸무게:");
        int cWhight = sc.nextInt();
        System.out.print("목표몸무게:");
        int gWhigjt = sc.nextInt();
        int week = 0;
        // while(cWhight>=gWhigjt){
        //     week++;
        //     System.out.print(week+"주차 감량 몸무게:");
        //     int lWight = sc.nextInt();
        //     cWhight -= lWight;
        // }                                             //while 문 이용
        do{
            week++;
            System.out.println(week+"주차 감량 몸무게:");
            int lWight = sc.nextInt();
            cWhight -= lWight;
        }while(cWhight>=gWhigjt);                       //do while 이용
             
        
        sc.close();                       //스캐너 닫기
        System.out.println(cWhight+"Kg 달성! 축하드립니다!");
        
    }
    
}
