class Solution {
    public int solution(int[] nums) {
        boolean chk = false;
        int answer = 0;

        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1 ; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if (num>=2)
                        chk = decimal(num);
                    if (chk == true)
                        answer++;
                }
            }
        }
        return answer;
    }
    public static boolean decimal(int num){
        boolean check = true;
        if (num == 2){
            return check;
        }
        for (int i = 2; i < num; i++) {
            if (num%i == 0){
                check = false;
                break;
            }
        }
        return check;
    }
}
