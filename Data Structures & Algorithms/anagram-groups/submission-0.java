public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String st = new String(arr);
            res.putIfAbsent(st, new ArrayList<>());
            res.get(st).add(s);
        }
        return new ArrayList<>(res.values());
    }
}