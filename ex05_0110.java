package 연습.javaFestival;

import java.util.Scanner;

public class ex05_0110 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int num1,num2,sum;
        
       
        while(true){
            System.out.print("A 입력 >>");
            num1 = sc.nextInt();
             System.out.print("B 입력 >>");
            num2 = sc.nextInt();
            sum = num1-num2;
            if(num1==0 && num2==0) break;             //num1 과 num2 가 0 일떄 종료한다.
            else System.out.println("결과 >>"+sum);        
        }
        sc.close();        
    }
    
}


