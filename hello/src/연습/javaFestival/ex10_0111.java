package 연습.javaFestival;

import java.util.Scanner;

public class ex10_0111 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.print("행 개수: ");
        int input = sc.nextInt();
        for(int i = 1 ; i<=input ; i++){
            // for(int j =1 ; j <= i; j++){
            //     System.out.print("*");
            // }System.out.println();             //정방향
            for(int j =1 ; j <= input-i; j++){
                System.out.print("*");
            }System.out.println();                //역방향
        }sc.close();
    }
    
}
