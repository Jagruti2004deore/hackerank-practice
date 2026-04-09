public class FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {

        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);

        return new int[]{first, last};
    }

    // helper function
    int findPosition(int[] nums, int target, boolean findFirst) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid;

                if (findFirst) {
                    end = mid - 1;   // go LEFT
                } else {
                    start = mid + 1; // go RIGHT
                }
            }
        }

        return ans;
    }
}
