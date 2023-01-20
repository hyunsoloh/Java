package 연습.자바문제;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("별 출력 문제");
        System.out.print("N:");
        int input = sc.nextInt();
        if(input>=1 && input<=100);
        for(int i = 1 ; i<=input ; i++){
            for(int j = 1; j<=i;j++){

                System.out.print("*");
            }
            System.out.println(" ");

        }
        sc.close();
        


      
        
    }
    
}
