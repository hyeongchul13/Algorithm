class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Index = 0;
        int cards2Index = 0;

        for (int i = 0; i < goal.length; i++) {
            if (cards1Index < cards1.length && goal[i].equals(cards1[cards1Index])) {
                cards1Index++;
                continue;
            }
            if (cards2Index < cards2.length && goal[i].equals(cards2[cards2Index])) {
                cards2Index++;
                continue;
            }
            return "No";
        }
        return "Yes";
    }
}