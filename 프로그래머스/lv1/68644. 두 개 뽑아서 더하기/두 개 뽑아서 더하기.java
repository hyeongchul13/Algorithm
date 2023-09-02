import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


class Solution {
    public int[] solution(int[] numbers) {
         Set<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int i= 0;
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            answer[i] = (int)iter.next();
            i++;
        }
        return answer;
    }
}