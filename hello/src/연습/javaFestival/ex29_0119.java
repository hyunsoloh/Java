package 연습.javaFestival;

import java.util.Scanner;


// ex22 에서 설명한 문자열(String) 을 문자로(char) 로 형변화를 하면 쉽게풀 수 있다.

public class ex29_0119 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======채점하기======");
        String input = sc.next();
        sc.close();

        int sum = 0 ;
        int cnt = 1;                                    // 반복문에서 사용 할 변수입니다. 
        
        for(int i = 0 ; i<input.length() ; i++){
            if(input.charAt(i) == 'o'){                 // ex22에서 설명했지만, input.CharAt(index) 는 배열입니다. index는 문자열의 위치이지요.
                sum+=cnt;
                cnt++;                                  // 'o' 가 나온다면 cnt 에 1을더해줍니다. 1 + 2 + 3 +.... 이러한 연산이 가능하게 만들어줍니다. 
            }else if(input.charAt(i) == 'x'){
                cnt = 1;                                // 'x' 가 나온다면 cnt 를 1로 다시 초기화 시켜줍니다.  
            }                                           // 그리고 합계를 나타내는 변수 sum 에 아무것도 하지 않으니 +0 이 된것과 동일하죠.
        }
        
        System.out.println("총합 : " + sum);
 
    }
}
