class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 1;

        while (true) {
            answer = answer * count;
            if(answer == n) {
                return count;
            } if(answer > n) {
                return count = count - 1;
            }
            count++;
        }
    }
}