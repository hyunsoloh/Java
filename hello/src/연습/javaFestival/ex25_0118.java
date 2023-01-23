package 연습.javaFestival;

// 2차원 배열 문제입니다.
public class ex25_0118 {
    public static void main(String[]aStrings) {
        int[][] array = new int[5][5];
        for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array.length; j++){
            array[i][j] = (j+1) + (i*5);                // 원본 배열을 만드는 과정입니다. 
        }
        }
        System.out.println("원본");
        for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array.length; j++){
            System.out.print(array[i][j]+"\t");
        }System.out.println();                          // 원본 배열의 단순한 출력입니다.
        }
        System.out.println();
        System.out.println("90도 회전");
        for(int i=array[0].length-1; i>=0 ; i--){       // 90도 회전입니다. 원본의 좌표가 어떻게 변화하는지 잘 캐치하면
        for(int j = 0 ; j<array.length; j++){           // 원본배열의 출력 순서를 조정하는 것 만으로도 원본배열을 이용해
            System.out.print(array[j][i] + "\t");       // 90도 회전을 재현할 수 있습니다.
        }System.out.println();                          // 90도 회전된 표에 원본배열의 좌표를 하나하나씩 찍어보신다면 쉽게 눈에 들어올것입니다.
        }
    }
}
