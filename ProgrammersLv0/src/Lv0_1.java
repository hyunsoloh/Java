import java.util.ArrayList;

class Solution {
    public int solution(String[] babbling) {

        String[] array = { "aya", "ye", "woo", "ma"};
        ArrayList<String> tempArray = new ArrayList<>();

        for(int i=0; i<array.length; i++){
            tempArray.add(array[i]);
            for(int j =0; j<array.length; j++){
                    String temp = "";
                for(int k =j; k<array.length; k++){
                    if(i!=j && i!=k){
                        temp += array[k];
                        tempArray.add(array[i]+temp);
                    }
                }
                String temptemp = array[ (array.length-1)-j ];
                for(int k = (array.length-1)-j; k>=0 ; k--){
                    if(k-1>=0 && i!=k-1){
                        temptemp += array[k-1];
                        tempArray.add(array[i] + temptemp);
                    }
                }
            }
        }
        int answer = 0;

        for(int i = 0; i<babbling.length; i++){
            for(int j = 0; j<tempArray.size(); j++){
                if(babbling[i].equals(tempArray.get(j))){
                    answer++;
                }
            }
        }

        return answer;
    }
}