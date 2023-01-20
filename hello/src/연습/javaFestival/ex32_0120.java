package 연습.javaFestival;

public class ex32_0120 {
    public static void main(String[]aStrings) {
        int num1 = 10;
        int num2 = 3;
        boolean result = isDivided(num1,num2);
        System.out.println(result);
    }

    private static boolean isDivided(int num1, int num2) {
        return (num1%num2==0);
    }
}
