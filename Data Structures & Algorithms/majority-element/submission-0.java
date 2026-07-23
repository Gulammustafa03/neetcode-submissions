class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=0;

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

            if(map.get(nums[i])>n/2){
                ans=nums[i];
            }
        }
        return ans;
    }
}