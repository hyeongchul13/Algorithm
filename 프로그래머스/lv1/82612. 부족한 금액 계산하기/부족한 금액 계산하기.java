class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long a= 0;

        for (long i = 1; i <= count ; i++) {
            a += price * i;
        }
        if ( a> money) answer = a - money;
        return answer;
    }
}