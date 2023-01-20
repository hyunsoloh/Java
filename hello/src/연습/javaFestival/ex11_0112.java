package 연습.javaFestival;

import java.util.Random;
import java.util.Scanner;

public class ex11_0112 {
    public static void main(String[]args) {
        Random rm = new Random();
        
        int cnt = 0;                                // 변수cnt : 틀린 횟수
        Scanner sc = new Scanner(System.in);
        while(cnt<=4){                              // 틀린횟수가 5번이되면 while문 종료
            int num1 = rm.nextInt(10);
            int num2 = rm.nextInt(10);
            System.out.print(num1+" + "+num2+" = ");
            int input = sc.nextInt();
            if(num1+num2 == input){
                System.out.println("SUCCESS!");
            }else{
                cnt++;                              // 틀릴때마다 cnt를 1씩 더해 틀린 횟수를 저장한다.
                System.out.println("Fail....");
            }
        }
        sc.close();                                    // cnt가 5가되면 반복문을 종료하고 
        if(cnt==5)System.out.println("GAME OVER!");  // cnt가 5 일때 문구를 출력한다.
    }
    
}
