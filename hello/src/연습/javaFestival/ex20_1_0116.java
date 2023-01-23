package 연습.javaFestival;

import java.util.ArrayList;
import java.util.Scanner;

//들어가기전
//이 방법은 ex20의 ArrayList 2차원 배열을 이용해 문제는 풀어나가는방식입니다.
//어디까지나 참고용으로 활용하길 바라며 저도 2차원 배열을 하는법을 구글링을 통해 배웠습니다.
//자세한 설명을 원하시는분은 따로 연락바랍니다.
public class ex20_1_0116 {
    public static void main(String[]aStrings) {
        System.out.println("정수입력 >>");
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        ArrayList<Integer>[] array = new ArrayList[input]; // 2차원 ArrayList 생성
        for(int i =0; i<input ; i++){
            array[i]= new ArrayList<Integer>();            // 배열 원소를 인스턴스로 지정한다.
        }

        for(int i = 0; i<input ; i++){
            for(int j =0; j<input ; j ++){
                array[i].add(1 + i + 5*j );                 // [i]번 인덱스에 (1+i+5*j)값을 추가한다.
            }
        }

        for(int i =0; i<input; i++){                        // 출력
            for(int j =0; j<input; j++){
                System.out.print(array[i].get(j) + "\t");
            }
            System.out.println();
        } 
    }
}
        