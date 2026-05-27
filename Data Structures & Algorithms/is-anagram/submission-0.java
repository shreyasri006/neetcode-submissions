class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> freqChart = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            freqChart.put(s.charAt(i), freqChart.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (freqChart.get(t.charAt(i)) != null) {
                freqChart.replace(t.charAt(i), freqChart.get(t.charAt(i)) - 1);
                if (freqChart.get(t.charAt(i)) == 0) {
                    freqChart.remove(t.charAt(i));
                }
            } else {
                return false;
            }
        }

        if (freqChart.isEmpty()) {
            return true;
        }

        return false;
    }
}
