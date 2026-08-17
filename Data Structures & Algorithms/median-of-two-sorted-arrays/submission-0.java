class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int [] merge = new int [len1+len2];
        int k=0;
        for(int i=0;i<len1;i++){
            merge[k]= nums1[i];
            k++;
        }
        for(int i=0;i<len2;i++){
            merge[k]=nums2[i];
            k++;
        }
        Arrays.sort(merge);
        int index = merge.length/2;
        double ans=0.0;
        if(merge.length % 2==0){
            ans = (merge[index-1]+merge[index])/2.0;
        }
        else {
            ans = merge[index];
        }
        return ans;
    }
}
