package 연습.javaFestival;

// 문제에 들어가기 앞서
// ex22 부터 꾸준히 쓰이고있는 String 을 char 로 변환하는 문제이다.
// .CharAt()의 index가 있는 배열의 특징을 기억하고 문제를 풀어나가면 된다.

public class ex33_0121 {
    public static void main(String[]aStrings) {
       System.out.println(getMiddle("test") );

    }

    private static String getMiddle(String input) {
        int i = input.length();
        if(i%2 == 0){
           return input.charAt(i/2-1)+""+input.charAt(i/2);     // index 의 값에 /2 를하여 중앙을 구한다.

        }else return input.charAt(i/2)+"";
        
        
    }
}
