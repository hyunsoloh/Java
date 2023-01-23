package 연습.javaFestival;

public class ex35_0121 {
    public static void main(String[]aStrings) {
        int base = 2;
        int n = 10;
        int result = powerN(base, n);
        System.out.println( "결과 확인 : "+ result);

    }
    private static int powerN(int base,int n ) {
        int j = base;
        int result = 1;
    
        for(int i = 1; i<=n; i++){      // 변수 i 는 제곱을 몇번할것인가에따라 길이가 결정된다.
            result*=j;                  // 여기서 result는 합산을 구하는 방식과 비슷하다 다만 곱셈을통하여 재곱을 구한다.
           
        }
        return result;
    }
}
