class Solution {
    public int numberOfSpecialChars(String word) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> used = new HashSet<>();

        for(int i = 0; i < word.length(); i++){

            char ch = word.charAt(i);

            int val = (int) ch;

            if(val >= 65 && val <= 90){
                set.add(val);
            }
        }

        int cnt = 0;

        for(int i = 0; i < word.length(); i++){

            char ch = word.charAt(i);

            int val = (int) ch;

            if(val >= 97 && val <= 122){

                if(set.contains(val - 32) && !used.contains(val)){

                    cnt++;

                    used.add(val);
                }
            }
        }

        return cnt;
    }
}