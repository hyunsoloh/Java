package 연습.javaFestival;

import java.util.Scanner;

public class ex23_0117 {
    public static void main(String[]aStrings) {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수입력:");
    int input = sc.nextInt();
    String inputStr = input + "";               // 정수를 문자열로 강제 형변화 시킨후 입력받은 수의 길이(자릿수)를 알아내기위하여
    int sum = 0;                                // 강제형변화를 시켰습니다만, 문제에서는 8의자리라고 명시되었기 때문에 생략해도 됩니다.
   
    sc.close();
    for(int i = 0; i<inputStr.length() ; i++){  // inputStr.length는 8입니다.
        sum = sum + (input%10);                 // 1의자리의 수를 알아내어 sum=0 이라는 변수에 합해줍니다.
        input/=10;                              // 1의 자리를 알아내어 값을 sum에 추가했으니 1의자리를 날려줍니다.
    }                                           // 이것을 for문을통해 input의 자릿수 만큼 반복해 줍니다.
    System.out.println("합은 "+sum + "입니다.");
    }
}
