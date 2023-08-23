class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int w = 0;
        int h = 0;

        for (int i = 0; i < sizes.length ; i++) {
            int x = Math.max(sizes[i][0],sizes[i][1]); //60,70,60,80
            int y = Math.min(sizes[i][0],sizes[i][1]);//50,30,30,40
            w = Math.max(w,x);
            h = Math.max(h,y);
        }
        answer = w*h;
        return answer;
    }
}