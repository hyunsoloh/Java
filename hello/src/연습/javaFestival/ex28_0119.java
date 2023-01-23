package 연습.javaFestival;

import java.util.ArrayList;
import java.util.Scanner;

// 문제를풀기전
// 사칙연산중 곱셈을 분해하여 연산하고 그 과정을 출력하는 문제이다.
// 코드를 작성하기전 문제에서 제시하는 곱생의 방식을 생각하고 코드를 짜면된다.
// 문제에서 제안하는 곱셈의 방식은 첫번째 입력받은 정수를 두 번째 입력받은 정수의 1의 자리와 곱셈하여 연산하고 출력한다.
// 그리고 10의 자리와 연산하고 출력하는데 이때 1의 자리는 생략된다. 
public class ex28_0119 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자 입력 >> ");
        int num1 = sc.nextInt();
        System.out.println("두 번쨰 숫자 입력 >> ");
        int num2 = sc.nextInt();
        sc.close();
        String num2leaght = num2+"";
        ArrayList<Integer> arrayNum = new ArrayList<>();    // 출력할 중간계산의 값들을 저장 할 배열을 생성한다.
        for(int i = 1 ; i <= num2leaght.length() ; i++){
            arrayNum.add(num2%10);                  
            num2/=10;                                       // 일의자리를 계산했으니 계산된 자리는 제외한다.
        }
        int sum = 0;
        int j = 1;
        for(int i = 0 ; i<arrayNum.size(); i++){
            sum =sum + num1*arrayNum.get(i)*j;              // 배열에 있는 속성들의 합을구하는데.
            j*=10;                                          // 단, 0번배열에는 생략된 것이 없으나 1번 배열에는 10의자리가 2번배열에는 100의자리가 생략되었음으로 이를 곱해준다.
            System.out.println(num1*arrayNum.get(i));       
        }
        System.out.println("총합 : " + sum);
    }
}
