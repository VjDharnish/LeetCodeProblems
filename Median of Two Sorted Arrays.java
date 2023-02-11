class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1_len = nums1.length;
        int num2_len = nums2.length;
        int[] arr = new int[num1_len+num2_len];
        int k =0;
        int ptr1= 0,ptr2=0;
        while(k < arr.length){
            if(ptr1>=num1_len){
                while(ptr2!=num2_len){
                    arr[k++]=nums2[ptr2];
                    ptr2++;
                }
                break;
            }
            else if(ptr2>=num2_len){
                while(ptr1!=num1_len){
                    arr[k++] =nums1[ptr1];
                    ptr1++;
                }
                break;
            }
            if(nums1[ptr1]>nums2[ptr2]){
                arr[k++] = nums2[ptr2];
                ptr2++;
            }
            else{
                 arr[k++] = nums1[ptr1];
                ptr1++;
            }
            
        }
     
        int mid  = arr.length/2;
        if(arr.length %2==0){
            return (arr[mid]+arr[mid-1])/2.0;
        }
        return arr[mid];
        
    }
}
