package 연습.javaFestival;

import java.util.Scanner;

// 문제를 시작하기전 ArrayList 의 2차원(기존 배열로는 array[][]) 배열 문제입니다.
// ArrayList 의 2차원 배열의 선언은 ArrayList<String>[] 변수명 = new ArrayList[];입니다.
// 문제를 봤을때 2차원 배열 문제라고 생각하기 쉬우나 단순히 2중 for문으로도 풀 수 있는문제입니다. 별찍기 처럼 말이죠!
// 두번째 for문 안에 배열되는 수의 규칙을 찾아 입력되는 정수 N만큼 출력하고 줄을넘기는 과정을 N번 반복하면 됩니다.
// 다음 파일 (ex20_1_0116)에서 ArrayList의 2차원 배열을 활용하여 문제를 풀어보도록 하겠습니다.

// 01월 16일의 연속된 두 개의 문제는 계산식의 변화만 존재할뿐 서로 같은 문제이니 연속으로 풀도록 하겠습니다.
public class ex20_0116 {                                    
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력:");
        int input = sc.nextInt();
        sc.close();
        for(int i = 0 ; i < input ; i++){
            for(int j = 0; j < input ; j++){                
                System.out.print((i+1) + (input*j) + "\t");
            }System.out.println();
        }
    }
}

// ---------------------다음문제 입니다.------------------- 
// Ctrl + / 통해 위 class를 주석처리 하고 같은 단축키로 아레 주석을 풀어주시면 됩니다.
// 전반적인 알고리즘은 똑같으나 계산식의 변화가있습니다.
// public class ex20_0116 {                          
//     public static void main(String[]aStrings) {
//         Scanner sc = new Scanner(System.in);     
//         System.out.println("정수 입력:");
//         int input = sc.nextInt();
//         sc.close();
//         for(int i = 0 ; i < input ; i++){
//             for(int j = 0; j < input ; j++){
//                 System.out.print((j+1) + (input*i) + "\t");
//             }System.out.println();
//         }
//     }
// }
