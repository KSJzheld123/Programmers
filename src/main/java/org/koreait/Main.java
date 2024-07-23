class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] list = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] < emergency[j]) {
                    list[i] += 1;
                }
            }
        }

        for(int i = 0; i < list.length; i++) {
            answer[i] = list[i] + 1;
        }

        return answer;
    }
}
