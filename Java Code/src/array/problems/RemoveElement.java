package array.problems;

public class RemoveElement {
    public int myRemoveElement(int[] nums, int val) {
        int left=0;
        int right = nums.length-1;

        for(int i=0; left<right; i++){

            if(nums[left] != val){
                left ++;
                continue;
            }
            while(right>0 && nums[right] == val){
                right--;
            }
            if(left<right  && nums[left] == val && nums[right] != val){
                nums[left] = nums[right];
                nums[right] = val;
                left++;
                right--;
            }
        }
        if(left==right && nums[left] == val){
            return left;
        } else if(left == right && nums[left] != val)
            return left+1;
        return left;
    }

    public int optimalRemoveElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
