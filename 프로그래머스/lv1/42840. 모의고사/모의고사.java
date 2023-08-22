import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] cnt = {0,0,0};
         int[] user1 = {1,2,3,4,5};
        int[] user2 = {2,1,2,3,2,4,2,5};
        int[] user3 = {3,3,1,1,2,2,4,4,5,5};
        
        for (int i = 0; i < answers.length; i++) {
            if(user1[i%5] == answers[i]) cnt[0]++;
            if(user2[i%8] == answers[i]) cnt[1]++;
            if(user3[i%10] == answers[i]) cnt[2]++;
        }
        int MaxScore = Math.max(cnt[0],Math.max(cnt[1],cnt[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(MaxScore == cnt[0]) list.add(1);
        if(MaxScore == cnt[1]) list.add(2);
        if(MaxScore == cnt[2]) list.add(3);

        answer = new int[list.size()];

        for(int i =0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}