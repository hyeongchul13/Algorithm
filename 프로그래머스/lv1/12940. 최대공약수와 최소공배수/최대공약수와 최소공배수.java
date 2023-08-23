import java.util.Arrays;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int i =0;
        while(true){
            i ++;
            if(n%i == 0 && m % i == 0){
                answer[0] = i;
            }
            if( i >= n) break;
        }
        i = 0;
        while (true){
            i++;
            if(answer[0] * i %m == 0 && answer[0] * i %n==0){
                answer[1] = answer[0]*i;
                break;
            }
        }
        return answer;
    }
}