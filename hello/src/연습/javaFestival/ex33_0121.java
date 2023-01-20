package 연습.javaFestival;



public class ex33_0121 {
    public static void main(String[]aStrings) {
       System.out.println(getMiddle("test") );

    }

    private static String getMiddle(String input) {
        int i = input.length();
        if(i%2 == 0){
           return input.charAt(i/2-1)+""+input.charAt(i/2);

        }else return input.charAt(i/2)+"";
        
        
    }
}
