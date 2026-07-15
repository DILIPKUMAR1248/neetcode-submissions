class PrefixTree {
    PrefixTree[] child;
    boolean eow;


    public PrefixTree() {
        child=new PrefixTree[26];
        
        eow=false;
         
    }

    public void insert(String word) {
        PrefixTree curr=this;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.child[idx]==null){
                curr.child[idx]=new PrefixTree();
            }
            curr=curr.child[idx];
        }
       curr. eow=true;

    }

    public boolean search(String word) {
        PrefixTree curr =this;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.child[idx]==null){
                return false;
            }
            if(i==word.length()-1 && curr.child[idx].eow==false){
                return false;

            }
            curr=curr.child[idx];
        }
return true;

    }

    public boolean startsWith(String prefix) {
        PrefixTree curr=this;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.child[idx]==null){
                return false;
            }

    curr = curr.child[idx];
        }
      return true;
    }
}
