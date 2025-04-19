class SortArrayByParity {

    public static void main(String[] args){
        int[] nums = {3,2,1,2,4};
        int[] sortedArr = sortArrayByParity(nums);
        for(int n: sortedArr){
            System.out.println(n);
        }
    }
    
    public static int[] sortArrayByParity(int[] nums) {
        int[] sortArr = new int[nums.length];
        int left =0; int right = nums.length-1;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                sortArr[left++] = nums[i];
            } else {
                sortArr[right--] = nums[i];
            }
        }
        return sortArr;
    }
}