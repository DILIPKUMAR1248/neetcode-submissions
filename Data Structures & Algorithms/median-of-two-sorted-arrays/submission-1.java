class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        
        int[] ans=new int[n+m];
        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                ans[k]=nums1[i];
                k++;
                i++;
            }else{
                ans[k]=nums2[j];
                j++;
                k++;
            }
        }

        while(i<m){
            ans[k]=nums1[i];
            i++;
            k++;
        }
          while(j<n){
            ans[k]=nums2[j];
            j++;
            k++;
        }
        if(k==1){
            return (double)ans[k];
        }

        int length=ans.length;
        int mid=length/2;
        double value=0.0;
        if(mid%2==0){
           value=(double)(ans[mid-1]+ans[mid])/2;
        }else{
            value=(double)ans[mid];
        }
return value;
    }
}
