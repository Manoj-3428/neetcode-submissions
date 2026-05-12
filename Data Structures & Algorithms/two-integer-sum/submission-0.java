class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first=0,second=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                second=i;
                first=map.get(target-nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return new int[]{first,second};

    }
}