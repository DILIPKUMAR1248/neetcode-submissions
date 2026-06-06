class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int m=nums1.length;
        int n=nums2.length;
      int max=Math.max(m,n);
      int[] arr=new int[max];
      int k=0;
      int i=0,j=0;
        while(i< m && j<n){
        if(nums1[i]<nums2[i]){
          arr[k]=nums1[i];
          i++;
        }else{
            arr[k]=nums2[j];
            j++;
        }
    }

    while(i<m){
        arr[k]=nums1[i];
        k++;
    }
    while(j<m){
        arr[k]=nums2[j];
        k++;
    }
return arr;
        
    }
}