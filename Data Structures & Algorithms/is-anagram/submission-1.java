class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charChart = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charChart[s.charAt(i) - 'a']++;
            charChart[t.charAt(i) - 'a']--;
        }

        for (int val : charChart) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
