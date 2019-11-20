class Solution {
    public int removeDuplicates(int[] nums) {
        // 题目已经说了一个排好序的，所以只需要用比较前后连个元素是否一样就可以，可以认为时双指针法，我们可以放置两个指针 ii 和 jj，其中 ii 是慢指针，而 jj 是快指针。只要 nums[i] = nums[j]，我们就增加 j以跳过重复项。

    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            
            i++;
            //分为两种情况，（1）两个数相等直接跳过，J走一步，下一次不相等就用后面的数覆盖前面的数，如果不相等，i走一步，总体的思路时J一定会走一步，如果不相等I才走一步，这样就去除了重复元素
            nums[i] = nums[j];
        }
    }
    return i + 1;
    }
}