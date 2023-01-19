package 연습.javaFestival;

import java.util.Random;
import java.util.Scanner;

public class ex11_0112 {
    public static void main(String[]args) {
        Random rm = new Random();
        
        int cnt = 0;                                //틀린 횟수
        Scanner sc = new Scanner(System.in);
        while(cnt<=4){
            int num1 = rm.nextInt(10);
            int num2 = rm.nextInt(10);
            System.out.print(num1+" + "+num2+" = ");
            int input = sc.nextInt();
            if(num1+num2 == input){
                System.out.println("SUCCESS!");
            }else{
                cnt++;
                System.out.println("Fail....");
            }
        }
        sc.close();
        if(cnt==5)System.out.println("GAME OVER!");
    }
    
}
