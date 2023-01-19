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
    
        for(int i = 1; i<=n; i++){
            result*=j;
           
        }
        return result;
    }
}
