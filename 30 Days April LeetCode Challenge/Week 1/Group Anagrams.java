class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sorted_string = new String(ch);
            if(!map.containsKey(sorted_string)) {
                map.put(sorted_string, new ArrayList<String>());
            }
            map.get(sorted_string).add(strs[i]);
        }   
        List<List<String>> finalList = new ArrayList<List<String>>();
        for(String element : map.keySet()) {
            finalList.add(map.get(element));
        }
        return finalList;
    }
}