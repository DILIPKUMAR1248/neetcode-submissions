class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> map=new HashMap<>();
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char []ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(!map.containsKey(st)){
                map.put(st,new ArrayList<>());
            }
            map.get(st).add(strs[i]);
        }
       return new ArrayList<>( map.values()); 
    }
}
