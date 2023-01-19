package 연습.javaFestival;

import java.util.Scanner;



public class ex01_0109 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int input = sc.nextInt();
        System.out.print("반올림 수 :");
        if(input%10<5){
            System.out.println(input/10+"0");
        }else System.out.println((input/10+1)*10);
        sc.close();
        
    }
    
}
