class Solution {
    public int solution(int[] common) {

        int num = 0;
        boolean isco = true;
        
        if((absoluteValue(common[1])-absoluteValue(common[0]))==(absoluteValue(common[2])-absoluteValue(common[1]))){
            num = common[1]-common[0];
            isco = true;
        }else if((double)common[1]/common[0]==(double)common[2]/common[1]){
            num = common[1]/common[0];
            isco = false;
        }
        int answer = 0;
        if(isco){
            answer = common[common.length-1] + num;
        }else answer = common[common.length-1] * num;
        return answer;
    }

    public int absoluteValue(int a) {
        if(a<0){
            a= -1*a;
            return a;
        }else return a;
    }
}
