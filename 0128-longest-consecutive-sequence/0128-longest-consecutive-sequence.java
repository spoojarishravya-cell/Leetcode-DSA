class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> numset=new HashSet<>();
       for(int num:nums){
        numset.add(num);
       } 
       int longest=0;
       for(int num:numset){
        if(!numset.contains(num-1)){
            int current=num;
            int count=1;


        while(numset.contains(current+1)){
            current++;
            count++;
        }
        longest=Math.max(count,longest);
        }
       }
       return longest;
    }
}