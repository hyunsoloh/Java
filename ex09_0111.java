package 연습.javaFestival;

import java.util.Scanner;

public class ex09_0111 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단수입력:");
        int input1 = sc.nextInt();
        System.out.print("어느 수 까지 출력:");
        int input2 = sc.nextInt();
        
        System.out.println(input1+"단");
        sc.close();  
        for(int j =1 ; j<=input2; j++){
            System.out.println(input1+"*"+j+"="+input1*j);
        }  
        
    }
    
}
