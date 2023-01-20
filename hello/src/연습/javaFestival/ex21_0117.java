package 연습.javaFestival;

import java.util.ArrayList;

public class ex21_0117 {
    public static void main(String[]aStrings) {
        int[] point = {92,32,52,9,81,2,68};
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<String> adr = new ArrayList<>();
        for(int i = 0 ; i<point.length; i++){
            for(int j = i ; j<point.length; j++){
                if(i!=j){
                    int k = point[i]-point[j];
                if(k>0){
                    array.add(k);
                    adr.add("[" + i +","+ j + "]");
                }else{
                    array.add(-k);
                    adr.add("[" + i +","+ j + "]");
                }
                }
            }
        }
        int small = 0;
        for(int i =0; i<array.size(); i++){
            if(array.get(i)<array.get(small)){
                small = i;
            }
        }
        System.out.println("result = " + adr.get(small));
    }
}
