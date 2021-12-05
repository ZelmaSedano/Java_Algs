class Solution {
    void twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int sum=0;
        for(int i=0; i < nums.length; i++){
            for(int j=(i+1); j < nums.length; j++){
                sum = nums[i] + nums[j];
                if(sum==target){
                    res[0]=nums[i];
                    res[1]=nums[j];
                }
            }
        }
        
        for(int h = 0; h < nums.length-1; h++) {
            System.out.print(res[h]);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int myArr[] = {1,2,3};
        s.twoSum(myArr, 5);

    }
}
