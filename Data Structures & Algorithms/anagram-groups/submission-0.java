class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char[] ch=str.toCharArray();
            Arrays.sort(ch);

            String str2=new String(ch);
            if(!map.containsKey(str2)){
                map.put(str2,new ArrayList<>());
            }
            map.get(str2).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}
