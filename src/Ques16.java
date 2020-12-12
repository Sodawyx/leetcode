import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>最接近的三数之和</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-11-30 20:18
 **/
public class Ques16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[nums.length-1];
        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(res - target)) res = sum;
                if (sum > target) {
                    while (left < right && nums[right] == nums[--right]);
                } else if (sum < target) {
                    while (left < right && nums[left] == nums[++left]);
                } else {
                    return sum;
                }
            }


        }
        return res;
    }

    public static void main(String[] args) {
        Ques16 q = new Ques16();
        System.out.println(q.threeSumClosest(new int[]{1,2,5,10,11}
        ,12));
    }
}
