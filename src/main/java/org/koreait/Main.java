class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int count = 0;
        String[] spell2 = new String[spell.length];

        for(int i = 0; i < spell.length; i++) {
            spell2[i] = spell[i];
        }

        for (int i = 0; i < dic.length; i++) {
            for(int j = 0; j < spell.length; j++) {
                if(dic[i].contains(spell[j])) {
                    spell[j] = "-";
                    count++;
                    break;
                }
            }

            for(int j = 0; j < spell2.length; j++) {
                spell[j] = spell2[j];
            }
        }

        if(count == spell.length) {
            answer = 1;
        }

        return answer;
    }
}