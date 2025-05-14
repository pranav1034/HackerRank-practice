class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int left=0;
        int right=n-1;

        // while (left < right) {
        //     int mid = left + (right - left) / 2;

        //     if (arr[mid] < arr[mid + 1]) {
        //         left = mid + 1;
        //     } else {
        //         right = mid;
        //     }
        // }
        // return left;

        return peakElement(arr,left,right);
    }

    public static int peakElement(int[] arr,int left,int right){
        if(left==right) return left;
        int mid =left + (right-left)/2;

        if(arr[mid]<arr[mid+1]){
            return peakElement(arr,mid+1,right);
        }
        else{
            return peakElement(arr,left,mid);
        }
    }
}