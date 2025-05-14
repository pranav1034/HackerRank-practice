class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {

        // HashSet<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     if (num > 0) {
        //         set.add(num);
        //     }
        // }

        // for (int i = 1; i <= nums.length + 1; i++) {
        //     if (!set.contains(i)) {
        //         return i;
        //     }
        // }

        int n=nums.length;

        for(int i=0;i<n;i++){
            while(nums[i]>0 && nums[i]<=n && nums[i]!=nums[nums[i]-1]){
                int idx= nums[i]-1;
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return n+1;


    }
}