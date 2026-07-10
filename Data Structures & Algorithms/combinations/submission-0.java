class Solution {
    public static void solve(int index,int n,int k,List<List<Integer>> list,List<Integer> subset){
        if (subset.size() == k) {
    list.add(new ArrayList<>(subset));
    return;
}

if (index > n) {
    return;
}
        for(int i=index;i<=n;i++){
        subset.add(i);
        solve(i+1,n,k,list,subset);
        subset.remove(subset.size()-1);
    }

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        solve(1,n,k,list,subset);
        return list;

        
    }
}