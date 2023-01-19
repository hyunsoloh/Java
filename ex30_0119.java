package 연습.javaFestival;
import java.util.Scanner;

public class ex30_0119 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2진수 입력 >> ");
        String input = sc.next();
        sc.close();
        int binaryNum = Integer.parseInt(input);
        int[] array = new int[input.length()];
        int decimaNum = 0;
        int temp = 1;
        for(int i = 0 ; i < input.length(); i++){
            array[i] = binaryNum%10;
            binaryNum/=10;
            decimaNum=decimaNum+array[i]*temp;
            temp*=2;

        } 
       System.out.println("2진수" + input + "의 10진수는 " + decimaNum + "입니다.");
        
    }
}
