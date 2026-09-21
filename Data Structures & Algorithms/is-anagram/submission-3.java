class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            int n=ch-'a';
            arr[n]+=1;
        }
        for(char ch:t.toCharArray()){
            int n=ch-'a';
            arr[n]--;
        }

        for(int n:arr){
            if(n!=0){
                return false;
            }
        }
    return true;
    }
}
