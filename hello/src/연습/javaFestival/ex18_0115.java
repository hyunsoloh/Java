package 연습.javaFestival;

import java.util.Random;

public class ex18_0115 {
    public static void main(String[]aStrings) {
        //로또번호는 1 ~ 45 까지 숫자를 6개 선택

        Random rm = new Random();
        int[] array = new int[6];
        int i = 0;
        for( i = 0; i<array.length ; i++){                      // 배열에 랜덤한 수 를 넣는 반복문.
            int j = rm.nextInt(44);
            array[i]=j;
            for(int k = 0; k<array.length ; k++){               // 중복을 탐색하는 반복문
                if(k!=i)                                        // 동일한 배열 제외 
                if(array[k]==array[i]){                         // 배열의 중복된 수를 탐색하는 조건문 
                                                                // 위의 두 if 문을 합쳐 if(k!=i && array[k]==array[i])라 표현 할 수있다.                                                 
                    System.out.println("중복되었습니다.");     // 중복을 확인하기위한 출력문이기 때문에 확인하시고 제외해 주세요.
                    i--;                                        // i를 -1 하여 해당 배열에 다시 랜덤한 숫자를 넣도록 조정
                }
                if(i<0) i=0;                                    // 위의 i-- 때문에 i 값이 음수가 되는 경우 i는 결국 배열의 index안에
            }                                                   // 들어가는 정수이기 때문에  out of bounds 오류가 뜨게됨으로 
        }                                                       // i 값을 0으로 초기화 시켜준다.
        for( int k = 0; k<array.length ; k++){
            System.out.println("행운의 숫자 : "+array[k]);
        }

    }
}
