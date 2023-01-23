package 연습.javaFestival;

import java.util.ArrayList;

// 문제를 시작하기전
// 저는 이 문제를 조금 멍청한방식으로 풀었습니다. 코드가 길어지고 배열도 두개나 생성했죠.
// 조금더 간단한 코드로 해결하는 방법이 있습니다.
public class ex21_0117 {
    public static void main(String[]aStrings) {
        int[] point = {92,32,52,9,81,2,68};
        ArrayList<Integer> arrayDistance = new ArrayList<Integer>();       // 배열에 존재하는 수들의 거리차를 저장하기위한 배열입니다.
        ArrayList<String> addr = new ArrayList<>();                        // 거리차 배열에 들어간 POINT배열의 원소를 알기위한 배열입니다.
        for(int i = 0 ; i<point.length; i++){
            for(int j = i ; j<point.length; j++){
                if(i!=j){                                                   // 같은 원소의 거리차를 구하는것을 방지하기 위한 조건
                    int k = point[i]-point[j];
                if(k>0){                                                    // 거리차는 절댓값 이기 때문에 음수와 양수를 분리하는 조건문을 작성    
                    arrayDistance.add(k);
                    addr.add("result = " + "[" + i +","+ j + "]");          // 거리의 차를 arrayDistence 에 추가한후 해당하는 i 와 j 값을
                }else{                                                      // addr 에 넣어줌 해당하는 값들은 같은 index에 들어있음.
                    arrayDistance.add(-k);                                  
                    addr.add("result = " + "[" + i +","+ j + "]");
                }
                }
            }
        }
        int small = 0;                                                       // 최솟값의 index를 구하는 반복문과 조건문.       
        for(int i =0; i<arrayDistance.size(); i++){
            if(arrayDistance.get(i)<arrayDistance.get(small)){
                small = i;
            }
        }
        System.out.println( addr.get(small));                                
    }
}
