package 연습.자바문제;

import java.util.Random;
import java.util.Scanner;



public class ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===가위 바위 보 게임입니다.===");
        System.out.println("[0].가위 [1].바위  [2]보 ");
        System.out.print("번호를 선택해 주세요.>>> ");
        int a = sc.nextInt();                    //a 는 사용자 가위바위보 값.
        Random rm = new Random();
        int b = rm.nextInt(3);            //b 는 컴퓨터 가위바위보 값.
        
        if(b==0)System.out.println("컴퓨터 : 가위");        //컴퓨터 입력값 출력.
        else if (b==1) System.out.println("컴퓨터 :바위");
        else System.out.println("컴퓨터 : 보");
                
        if(a==b) System.out.println("무승부입니다.");
        else if(a==0&&b==2) System.out.println("사용자 승리입니다.");
        else if(a==1&&b==0) System.out.println("사용자 승리입니다.");
        else if(a==2&&b==1) System.out.println("사용자 승리입니다.");
        else System.out.println("컴퓨터 승리입니다.");
        sc.close();





        
    }
    
}
