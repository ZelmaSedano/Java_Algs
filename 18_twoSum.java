// create a method that finds the largest element in a given array of ints
public class Practice {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++)
            for(int j = i + 1; j < nums.length; j++)
                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
                    return new int[2]; 
    }

	public static void main(String[] args) {  // main block
        Practice p = new Practice();

        int myArr[] = {1,2,3,4,5,6};
        int newArr[] = p.twoSum(myArr, 3);

        for(int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    
    } // end of main block

} // end of class
