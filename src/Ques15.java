import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>三数之和</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-11-30 18:43
 **/
public class Ques15 {
    //排序+双指针法
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] > 0) return res;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    while (left < right && nums[right] == nums[--right]);
                } else if (sum < 0) {
                    while (left < right && nums[left] == nums[++left]);
                } else {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[left], nums[right])));
                    while (left < right && nums[left] == nums[++left]);
                    while (left < right && nums[right] == nums[--right]);
                }
            }

        }
        return res;

    }

    public static void main(String[] args) {
        Ques15 q = new Ques15();
        System.out.println(q.threeSum(new int[]{1,-1,-1,0}));
    }

}
