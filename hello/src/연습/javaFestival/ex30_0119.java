package 연습.javaFestival;
import java.util.Scanner;
// 문자열(String)을 정수현(int)로 형변화시켜 푸는 문제입니다.(다른방식은 모르겠습니다.)
// 문자열을 정수형으로 형변화 시키는 함수 : int 변수명 = Integer.perseInt(정수형으로 형변화할 문자열의 변수명)
// 위의 함수를 쓰면 "100" 이 정수 100으로 형변화 합니다.
public class ex30_0119 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2진수 입력 >> ");
        String input = sc.next();
        sc.close();                                     
        int binaryNum = Integer.parseInt(input);        // binaryNum 2진수의 변수입니다. 
        int[] array = new int[input.length()];          // 2진수의 정보 (0 or1) 을 저장할 배열입니다. 없어도 무방합니다.
        int decimaNum = 0;                              // decimaNum 10진수를 담을 변수입니다.
        int temp = 1;                                   // 변수 temp 는 반복문 안에서 2의 제곱근을 구하기위해 선언하였습니다.
        for(int i = 0 ; i < input.length(); i++){       // 2진수를 10진수로 변환하는 반복문.
            array[i] = binaryNum%10;                    // 2진수의 1의자리를 추출합니다.
            binaryNum/=10;                              // 1의자리를 추출했으니 제외해줍니다.(변환된 정수는 10의자리임으로 10을 나누어줍니다.)
                                                        // 추가로 설명하자면 위에서 입력받은 문자열 2진수는 결국 문자열이며 이를 정수로 형변화시킨 값은 10진수입니다. 
            decimaNum=decimaNum+array[i]*temp;          // decimaNum에 2진수의 1의자리에 2의 0승을 곱해줍니다.
            temp*=2;                                    // 1*2 , 2*2 , 4*2 ..... 을 하여 2의 i 승을 temp로 표현해 줍니다.

        } 
       System.out.println("2진수" + input + "의 10진수는 " + decimaNum + "입니다.");
        
    }
}
