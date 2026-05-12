class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            int[] count = new int[26];

            // Count characters
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }

            // Build unique key
            StringBuilder keyBuilder = new StringBuilder();

            for (int num : count) {
                keyBuilder.append(num).append('#');
            }

            String key = keyBuilder.toString();

            // Store grouped words
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
    
}
